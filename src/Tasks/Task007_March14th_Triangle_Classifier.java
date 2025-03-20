package Tasks;

import java.util.Scanner;

public class Task007_March14th_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle : ");
        int s1 = scanner.nextInt();
        System.out.println("Enter second side of triangle : ");
        int s2 = scanner.nextInt();
        System.out.println("Enter third side of triangle : ");
        int s3 = scanner.nextInt();

        if(s1==s2 && s2==s3) {
            System.out.println("this is an equilateral triangle as all the sides are equal");
        } else if(s1==s2 || s2==s3 || s3==s1){
            System.out.println("this is an isosceles triangle , exactly two sides are equal");
        } else {
            System.out.println("this is an scalene triangle , no sides are equal");
        }

    }
}
