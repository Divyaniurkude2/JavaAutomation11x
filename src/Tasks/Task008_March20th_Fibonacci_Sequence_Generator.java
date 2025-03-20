package Tasks;

import java.util.Scanner;

public class Task008_March20th_Fibonacci_Sequence_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers to generate : ");
        int n = scanner.nextInt();
        scanner.close();
        int  first = 0, second = 1;
        System.out.println("Fibonacci Sequence: " + first + " " + second + " ");

        for (int i=2; i < n; i++) {
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
}
