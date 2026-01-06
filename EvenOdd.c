#include <stdio.h>
int main()
{
int number;
 printf("Please Enter an Integer: ");
 scanf("%d", &number);
 
 if(number % 2==0){ //if loop to help other outcomes
     printf("the number is Even\n");
     } else{
         printf("the number is Odd\n");
     }
 
 
 return 0;
}
