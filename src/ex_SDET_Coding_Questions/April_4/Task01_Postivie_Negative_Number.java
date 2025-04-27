package ex_SDET_Coding_Questions.April_4;

import java.util.Scanner;

public class Task01_Postivie_Negative_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("This is a positive number.");
        }else {
            System.out.println("This is a negative number.");
        }
    }
}
