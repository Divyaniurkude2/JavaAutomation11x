package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Divyani";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        //2. concat()
        System.out.println(name.concat("Urkude"));

        //3. contains()
        System.out.println(name.contains("Vijay"));

        //4. equals()
        System.out.println(name.equals("Divyani"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("divyani"));

        //6.indexof()
        System.out.println(name.indexOf('i'));

        String s1= "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf('m'));

        //7.length()
        System.out.println(name.length());

        //8.replace( , )
        System.out.println(name.replace('n','N'));

        //9. split()
        String name4 = "divyani@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //10. subString( , )
        System.out.println(name.substring(1,3));

        //11. toLowerCase()
        System.out.println("DIVYANI".toLowerCase());

        //12.toUpperCase
        System.out.println("DIVYANI".toUpperCase());

        //13. startsWith()
        System.out.println(name.startsWith("D"));

        //14. endsWith()
        System.out.println(name.endsWith("i"));

        // 16. trim()
        String name3 = "    Divyani Vijay    ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Divyani"));


        StringBuilder stringBuilder = new StringBuilder("Divyani");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Divyani";
        String s21 = s11.concat("Urkude");
        System.out.println(s21);

//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);



        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));







    }

}
