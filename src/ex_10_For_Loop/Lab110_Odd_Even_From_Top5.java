package ex_10_For_Loop;

public class Lab110_Odd_Even_From_Top5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) {
            if(i % 2 == 0) {
                System.out.println("Even ->" +i);
            }
        }
    }
}
