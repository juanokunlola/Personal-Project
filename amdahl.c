#include <stdio.h> // Printf 
#include <stdlib.h> 
#include <time.h> // Usagae of Clock

#define SIZE 30000 //limit lags

void swap(int *a, int *b) { // Helper to swap two values
    int temp = *a;
    *a = *b;
    *b = temp;
}

void fill_array(int arr[], int n) { //The Array loops for the data
    for (int i = 0; i < n; i++) {
        arr[i] = rand() % 100000; // random be in a managable range 
    }
}

// 2. Slow part: Bubble Sort - O(N^2)
void bubble_sort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) { //call for a swap if needed.
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}

int partition(int arr[], int low, int high) {
    int pivot = arr[high]; // For the high and low pick
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

void quick_sort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quick_sort(arr, low, pi - 1);
        quick_sort(arr, pi + 1, high);
    }
}

int main(void) {
    srand((unsigned int)time(NULL));

    int *arr = malloc(SIZE * sizeof(int)); // allocate memory for our array
    if (arr == NULL) {
        printf("Could not allocate memory!\n");
        return 1;
    }

    clock_t total_start1 = clock();

    fill_array(arr, SIZE); // serial part of array

    clock_t sort_start1 = clock();
    bubble_sort(arr, SIZE); // slow part of array
    clock_t sort_end1 = clock();

    clock_t total_end1 = clock();

    double T_unoptimized = (double)(total_end1 - total_start1) / CLOCKS_PER_SEC;
    double T_proc_unopt = (double)(sort_end1 - sort_start1) / CLOCKS_PER_SEC;

    
    clock_t total_start2 = clock();

    fill_array(arr, SIZE); // serial part

    clock_t sort_start2 = clock();
    quick_sort(arr, 0, SIZE - 1); // fast part
    clock_t sort_end2 = clock();

    clock_t total_end2 = clock();

    double T_optimized = (double)(total_end2 - total_start2) / CLOCKS_PER_SEC;
    double T_proc_opt = (double)(sort_end2 - sort_start2) / CLOCKS_PER_SEC;

    // 3. AMDAHL'S LAW CALCULATIONS PART
    
    double P = T_proc_unopt / T_unoptimized;
    double S = T_proc_unopt / T_proc_opt;
    double measured_speedup = T_unoptimized / T_optimized;
    double theoretical_speedup = 1.0 / ((1.0 - P) + (P / S));

    
    printf("--- UNOPTIMIZED (BUBBLE SORT) ---\n");
    printf("Total Time (T_unoptimized): %f seconds\n", T_unoptimized);
    printf("Sort Time (T_proc_unopt):   %f seconds\n\n", T_proc_unopt);

    printf("--- OPTIMIZED (QUICK SORT) ---\n");
    printf("Total Time (T_optimized):   %f seconds\n", T_optimized);
    printf("Sort Time (T_proc_opt):     %f seconds\n\n", T_proc_opt);

    printf("-- AMDAHL'S LAW --\n");
    printf("P (Proportion of optimizable):             %f\n", P);
    printf("S (Speedup of the optimized part):           %f\n", S);
    printf("Measured Overall Speedup:   %fx\n", measured_speedup);
    printf("Theoretical Speedup:        %fx\n", theoretical_speedup);

    free(arr);
    return 0;
}
