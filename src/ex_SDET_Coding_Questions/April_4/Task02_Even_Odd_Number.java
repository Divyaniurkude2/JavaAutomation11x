package ex_SDET_Coding_Questions.April_4;

import java.util.Scanner;

public class Task02_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0 ){
            System.out.println("Even Number.");
        }else {
            System.out.println("Odd Number.");
        }
    }
}
