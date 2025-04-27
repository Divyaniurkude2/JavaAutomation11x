package ex_SDET_Coding_Questions.April_4;

import java.util.Scanner;

public class Task05_Person_Eligible_For_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("You are adult and eligible to vote!");
        }else {
            System.out.println("Your are minor and not eligible to vote!");
        }
    }
}
