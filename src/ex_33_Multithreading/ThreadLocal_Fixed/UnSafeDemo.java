package ex_33_Multithreading.ThreadLocal_Fixed;

public class UnSafeDemo {
    public static void main(String[] args) throws Exception {
        UnsafeCounter1 usc = new UnsafeCounter1();
        Thread[] tasks = new Thread[100];

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 100; j++)
                    usc.increment();
            });
            tasks[i] = t;
            t.start();
        }

        for (int i = 0; i < 100; i++) {
            tasks[i].join();
        }

        System.out.println(usc.count);
    }
}

class UnsafeCounter1 {
    int count = 0;

    void increment() {
        count = count + 1;
    }
}
