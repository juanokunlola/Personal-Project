import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter initial balance:  ");
        double initial = scanf.nextDouble();

        System.out.print("Enter deposit amount:  ");
        double deposit = scanf.nextDouble();

         System.out.print("Enter withdrawal amount:  ");
        double withdrawal = scanf.nextDouble();

        double average = (initial + deposit - withdrawal);

        System.out.printf("The updated balance is: : %.1f ", average); // don't forget printf for float output

        scanf.close();

    }
}
