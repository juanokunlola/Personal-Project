#include <stdio.h>  

int main() {  
    int arr[5][5];  
    int exchange[5][5];  
//Juan Okunlola - 1002180771
    for (int i = 0; i < 5; i++) {  
        for (int j = 0; j < 5; j++) {  
            arr[i][j] = i;  
        }  
    }  

    printf("The 5X5 array is :\n");  
    for (int i = 0; i < 5; i++) {  
        for (int j = 0; j < 5; j++) {  
            printf("%d ", arr[i][j]);   
        }  
        printf("\n");  
    }  

    printf("The exchange of 5X5 array is :\n");  
    for (int i = 0; i < 5; i++) {  
        for (int j = 0; j < 5; j++) {  
            transpose[j][i] = arr[i][j];   
            printf("%d ", transpose[j][i]);   
        }  
        printf("\n");  
    }  

    return 0;  
}  
