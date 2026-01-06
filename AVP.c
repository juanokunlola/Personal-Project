#include <stdio.h>  

int main(void) {  
    float length, width, area, perimeter;  

    printf("Please enter the length of a rectangle: ");  
    scanf("%f", &length);  
    printf("Please enter the width of a rectangle: ");  
    scanf("%f", &width);  
 
    area = length * width;  
    perimeter = 2 * (length + width);  

    printf("The area of the rectangle = %.2f\n", area);  
    printf("The perimeter of the rectangle = %.2f\n", perimeter);  

    return 0;  
}
