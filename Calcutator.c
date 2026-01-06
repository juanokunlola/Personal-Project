#include <stdio.h>
//Juan Okunlola Work
int main()
{
    char operator;
    double Opera1, Opera2;
    double result;

    
    printf("Enter Numbers 1: ");
    scanf("%lf", &Opera1 );

     printf("Enter operator (+, -, *, /): ");
    scanf(" %c", &operator);
    

    printf("Enter Numbers 2: ");
    scanf("%lf", &Opera2 );

    switch (operator)
    {
    case '+':
    result = Opera1 + Opera2;
    printf("\nresult: %.2lf ", result);
        break;

        case '-':
    result = Opera1 - Opera2;
    printf("\nresult:%.2lf ", result);
        break;

        case '*':
        result = Opera1 * Opera2;
        printf("\nresult: %.2lf ", result);
            break;

            case '/':
            result = Opera1 / Opera2;
            printf("\nresult: %.2lf ", result);
                break;   
    
    default:
    printf("%c is not valid to Processed", operator);
    }


    return 0;
}
