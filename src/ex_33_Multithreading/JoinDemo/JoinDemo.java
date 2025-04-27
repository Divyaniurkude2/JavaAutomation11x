package ex_33_Multithreading.JoinDemo;

public class JoinDemo {
    public static void main(String[] args)  throws Exception{
        Work w1 = new Work();
        MyThread th1 = new MyThread(w1, "A");
        th1.start();
        th1.join();
        Thread th = Thread.currentThread();
        for (int i = 1 ; i<= 5; i++){
            System.out.println(th.getName() + " --- " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception ex) {

            }
        }
    }
}
class MyThread extends Thread{
    Work work;

    public  MyThread(Work hello, String name){
        super(name);
        this.work = hello;
    }

    public void run(){
        work.show();
    }
}
class Work {
    void show() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " -- " + i);
            try {
                Thread.sleep(10000);
            } catch (Exception ex) {
            }
        }
    }
}