package Tasks.Encapsulation_4thApril;

public class OverLoading_And_OverRiding {
    public static void main(String[] args) {

        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Overloading Examples:");
        System.out.println("Add 2 int: " + calc.add(5, 10));
        System.out.println("Add 3 int: " + calc.add(2, 3, 4));
        System.out.println("Add 2 double: " + calc.add(2.5, 3.5));

        //Method Overriding
        Animal1 animal = new Animal1();
        animal.sound();

        Dog1 dog = new Dog1();
        dog.sound();

    }
}



// Method Overloading
class Calculator {
    int add(int a, int b){
        return  a+b;
    }
    double add(double a,double b){
        return  a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
    String getType(){
        return "Basic Calculator";
    }
}


class Animal1 {
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog1 extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}