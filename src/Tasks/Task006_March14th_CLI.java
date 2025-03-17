package Tasks;

import java.util.Scanner;

public class Task006_March14th_CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name= scanner.nextLine();

        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();



        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        System.out.println("Maximum of " + num1 +" " + "and " + num2 +" " + "is: " + max);


    }
}
