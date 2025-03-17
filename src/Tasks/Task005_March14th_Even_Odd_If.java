package Tasks;

import java.util.Scanner;

public class Task005_March14th_Even_Odd_If {
    public static void main(String[] args) {

        // Take a input from user and check weather the input is even or odd number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int Num = scanner.nextInt();
        System.out.println(Num);

        if(Num%2==0)
        {
            System.out.println("The number is Even.");
        }
        else {
            System.out.println("The number is odds.");
        }
    }
}
