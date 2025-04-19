package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        new Cat();

        c1.running();
//        c2.running();
    }
}
   class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
   }
