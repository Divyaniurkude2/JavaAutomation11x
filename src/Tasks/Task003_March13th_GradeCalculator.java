package Tasks;

import java.util.Scanner;


public class Task003_March13th_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score Value: ");
        int n = scanner.nextInt();
        String result = (n < 0 || n > 100) ? "Invalid Score! Please enter a value between 0 and 100."
                :(n<=100 && n>=90) ?"A"
                :(n<=89 && n>=80)?"B"
                :(n<=79 && n>=70)?"C"
                :(n<=69 && n>=60)?"D":"F";
        System.out.println("Your grade is: " + result);
    }

}
