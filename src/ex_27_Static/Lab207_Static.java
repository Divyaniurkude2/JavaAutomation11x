package ex_27_Static;

public class Lab207_Static {
    public static void main(String[] args) {
        B.commomToAll();
        System.out.println(B.b);

        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);
    }
}

class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b =10;

    void display(){
        System.out.println(b);
        System.out.println("Non static F(n)");
    }
    static  void commomToAll(){
        System.out.println("Static F(n)");
    }
}