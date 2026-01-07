/*
Author: Juan Okunlola
Program: Personal Information Display
Purpose: To learn how to properly collect a user's name, age, and height and display it clearly in java while using print.
Reflection: This program has helped me practice using different variable types like 
            String, int, and double for user input similar to c but in different context.
*/

//Task 1 
//Comments are learning notes.

import java.util.Scanner;

 public class Personalinfo{
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in); // like a scanf declaration(in c ) 
        
        System.out.print("Enter your first name: "); // similar to printf in c for the first name
        String firstName = scanf.next(); // Use next() to read a single word
        
        System.out.print("Enter your last name: ");
        String lastName = scanf.next(); // Use next() to read a single word but nextline() is for mulitipe wording
        
        System.out.print("Enter your age: ");
        int age = scanf.nextInt();
         
        System.out.print("Enter your height in meters: ");
        double height = scanf.nextDouble();
        
        System.out.println("\nYour name is " + firstName + " " + lastName + "."); // + combines
        
        System.out.println("You are " + age + " years old.");
        
        System.out.println("Your height is " + height + " meters.");

        scanf.close();
    }
}
