package ex_33_Multithreading.Synchronization;

import java.util.ArrayList;

public class Sync01 {
    public static void main(String[] args) {
        Sync a = new Sync();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
    }
}

class Sync{
    void m1() {
        synchronized (this.getClass()) {
            System.out.println("Default Object of class will be locked!!");
        }
    }

    static void m2() {
        synchronized (Sync.class) {
            System.out.println("Default Object of class will be locked!!");
        }
    }

    void m3() {
        synchronized (this) {
            System.out.println("Current Object of class will be Locked!!");
        }
    }

    void m4() {
        ArrayList a = new ArrayList();
        synchronized (a) {
            System.out.println("Third Party Object of Class will be locked!!");
        }
    }
}