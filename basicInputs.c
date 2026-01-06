#include <stdio.h>

int main() {
    char character;
    int Var;
    float float_;

    // Juan OKunlola - 1002180771
    printf("Please Enter a Character: ");
    scanf(" %c", &character);  
   
    printf("Please Enter an Integer Value: ");
    scanf("%d", &Var);

    printf("Please Enter Float Value: ");
    scanf("%f", &float_);

    printf("The Character that you Entered is: %c\n", character);
    printf("The Integer Value that you Entered is: %d\n", Var);
    printf("The Float Value that you Entered is: %f\n", float_);

    return 0;
}
