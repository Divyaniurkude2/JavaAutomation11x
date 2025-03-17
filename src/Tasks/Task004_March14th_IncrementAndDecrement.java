package Tasks;

public class Task004_March14th_IncrementAndDecrement {
    public static void main(String[] args) {

        //Task 1 Increment And Decrement
            int a = 10;
        System.out.println("Print the Value of a:" +( ++a + a++ + a++)); //34
        System.out.println("Print the value of a:" +(a));//13

            int b = 20 ;
        System.out.println("Print the value of b:" + (--b + b++ + b--));//  58
        System.out.println("Print the value of b" + (b)); // 19
    }
}
