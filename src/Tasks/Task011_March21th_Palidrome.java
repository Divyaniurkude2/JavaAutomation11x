package Tasks;

import ex_19_OOPs_Inheritance.multilevel_inheritance.Son;

import java.util.Scanner;

public class Task011_March21th_Palidrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
