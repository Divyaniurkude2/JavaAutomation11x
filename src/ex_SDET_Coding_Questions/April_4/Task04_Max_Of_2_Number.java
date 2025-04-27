package ex_SDET_Coding_Questions.April_4;

import java.util.Scanner;

public class Task04_Max_Of_2_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Firest Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("First Number is Max!");
        }else {
            System.out.println("Second Number is Max!");
        }
    }
}
