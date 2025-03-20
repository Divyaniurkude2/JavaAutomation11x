package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        //Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program \n Enter the no Whose Factorial you want");
        int number = scanner.nextInt(); // Read an interger input from the user

        int factorial = 1; // Initialize the factorial variable to 1

        if(number <= 0){ // Check if the number is less than or equal to 0
            System.out.println(factorial); // if true, print the factorial (which is 1)
        }else {
            //if the number is greater than 0, calculate the factorial
            for (int i = 1; i <= number ; i++) { //Loop from 1 to the number
                factorial = factorial * i; // Multiply the current factorial value by i
            }
        }
        System.out.println("Factorial is ->" + factorial); //Print the calculated factorial
    }
}
