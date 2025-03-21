package ex_12_DoWhile;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println("This is body, which will execute 1 time");
            System.out.println(a);
            a++;
        }while (a < 10);
    }
}
