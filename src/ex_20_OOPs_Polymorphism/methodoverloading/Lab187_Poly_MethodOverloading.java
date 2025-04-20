package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab187_Poly_MethodOverloading {
    MathOperations m1 = new MathOperations();
    double r1 = m1.add(3, 4);
    int r2 = m1.add(3,4,9);
    double r3= m1.add(3.14,5.46);
}

class MathOperations {

    int add(int a , int b, int c){
        return a + b +c;
    }

    double add(double a , double b){
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }
}
