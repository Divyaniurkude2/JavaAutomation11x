package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
            String s0 = "Divyani";
            String s1 = new String("Divyani");

            //less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Divyani");
        StringBuilder stringBuilder = new StringBuilder("Divyani");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
