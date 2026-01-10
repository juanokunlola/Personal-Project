import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        int number = scanf.nextInt();

        int square = (number * number);

        System.out.printf("The square of "+ " " + number + " " + "is: %d", square ); // undertsanding spacing is important 
       

        int cube = (number * number * number);

        System.out.printf("\nThe cube of "+ " " + number + " " + "is: %d%n", cube );
       
        scanf.close();

    }
}
