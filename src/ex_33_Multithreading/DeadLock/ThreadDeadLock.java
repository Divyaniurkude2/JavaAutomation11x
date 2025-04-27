package ex_33_Multithreading.DeadLock;

public class ThreadDeadLock {
    public static void main(String[] args) {
        final String resource1 = "ATB";
        final String resource2 = "MTB";

        Thread t1 = new Thread(){
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 : locked resource 1");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e) {

                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1 : locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 : locked resource 1");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e) {

                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1 : locked resource 2");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
