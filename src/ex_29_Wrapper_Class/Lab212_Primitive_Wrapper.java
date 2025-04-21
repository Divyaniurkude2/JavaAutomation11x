package ex_29_Wrapper_Class;

public class Lab212_Primitive_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        //This is not Object
        //It will not have attribute or behaviour

        //char, short , byte,long,float,double, - we will avoid them now

        //we will use the wrapper classes,
        //Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
