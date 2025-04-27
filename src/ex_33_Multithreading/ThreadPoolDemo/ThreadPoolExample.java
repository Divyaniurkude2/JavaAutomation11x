package ex_33_Multithreading.ThreadPoolDemo;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);

        for(int i = 0; i<10; i++){
            Runnable task = new RunnableTask("Task" + i);
            executor.execute(task);
        }

        ((ExecutorService) executor).shutdown();
    }}

class RunnableTask implements Runnable {
    private String name;

    public  RunnableTask(String name){
        this.name = name;
    }

    public void run() {
        System.out.println("Starting " + name);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        System.out.println("Complete"+ name);
    }
}