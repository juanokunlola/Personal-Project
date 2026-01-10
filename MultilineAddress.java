import java.util.Scanner;

public class MultilineAddress {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter street address: ");
        String street = scanf.nextLine();

        System.out.print("Enter city: ");
        String city = scanf.nextLine();

         System.out.print("Enter state: ");
        String state = scanf.nextLine();

        System.out.print("Enter ZIP code: ");
        int ZIP = scanf.nextInt();

        System.out.println("\nYour address is: ");
        System.out.println(street);
                System.out.println(city + "," + state + " " + ZIP ); // Lesson to make space  use (+ " ") or comma. 


        scanf.close();

    }
}
