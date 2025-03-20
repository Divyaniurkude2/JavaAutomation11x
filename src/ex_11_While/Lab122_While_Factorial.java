package ex_11_While;

import java.util.Scanner;


public class Lab122_While_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program \n Enter the number whose factorial you want");
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // Initialize the factorial variable to 1
        int i = 1; // Initialize loop counter

        if (number < 0) { // Check if the number is negative
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            while (i <= number) { // Loop from 1 to the number
                factorial *= i; // Multiply the current factorial value by i
                i++; // Increment the loop counter
            }
            System.out.println("Factorial is -> " + factorial); // Print the calculated factorial
        }
    }
}
