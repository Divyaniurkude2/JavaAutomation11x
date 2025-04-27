package ex_33_Multithreading.ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i<=7; i++)
            executorService.execute(helloThread);
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 2 ; i++) {
            executorService1.execute(helloThread);
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + "worked and displayed by "+ th.getName());
            try {
                Thread.sleep(1000);
            }catch (Exception ex){

            }
        }
    }
}