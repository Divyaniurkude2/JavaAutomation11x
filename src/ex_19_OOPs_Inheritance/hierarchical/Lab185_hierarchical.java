package ex_19_OOPs_Inheritance.hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Ruhani r1 = new Ruhani();

        r1.home();
        f1.home();

        Divyani d1 = new Divyani();
        d1.home();

        Sejal s1 = new Sejal();
        s1.s2();
        s1.home();
    }
}

class Father{
    void home() {
        System.out.println("3BHK");
    }
}

class Divyani extends Father{
    void h2(){
        System.out.println("h2 - Divyani");
    }
}

class Sejal extends Father{
    void s2(){
        System.out.println("Sejal");
    }
}

class Ruhani extends Father {
    void r1(){
        System.out.println("ruhani");
    }
}