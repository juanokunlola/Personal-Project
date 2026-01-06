#include <stdio.h>

int main() {  
    double dollars;
    int amount, quarters, dimes, nickels, pennies;  //Declaring changes

    printf("Enter the amount for which change must be created: $");  
    scanf("%lf", &dollars);  
    
    amount = (int)(dollars * 100 + 0.5); // Help Convert dollars to cents

    quarters = amount / 25;  
    amount %= 25;  

    dimes = amount / 10;  
    amount %= 10;  

    nickels = amount / 5;  
    amount %= 5;  

    pennies = amount;  
    
    printf("\nFor $%.2f, you get:\n", dollars); // .2f 2 decimal places

    printf("%d quarter(s), %d dime(s), %d nickel(s) and %d penny(ies)\n",  
           quarters, dimes, nickels, pennies);  

    return 0;  
}
