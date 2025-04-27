package ex_33_Multithreading.Synchronization;

import ex_30_Exceptions.Bank;

public class BankAppDemo {
    public static void main(String[] args) {
        Bank1 at = new Bank1();
        Runnable runnable = new AccountThread(at);
        Thread th1 = new Thread(runnable, "Divyani");
        th1.start();;
        Thread th2 = new Thread(runnable, "Sejal");
        th2.start();

    }
}

class AccountThread implements Runnable {
    Bank1 bank;

    public  AccountThread(Bank1 accService){
        this.bank = accService;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            bank.withdraw(225);
            if(bank.getBalance() < 0) {
                System.out.println("Amount Max out!");
            }
        }
    }
}

class Bank1 {
    int balance = 1000;

    synchronized  void withdraw(int amountTo) {
        Thread th = Thread.currentThread();
        if (balance >= amountTo) {
            System.out.println("Withdraw ->" + amountTo + "\t" + th.getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

            balance = balance - amountTo;
            System.out.println(balance + "done -> \t" + th.getName());
        }else {
            System.out.println("Low Balance");
        }
    }
    public  int getBalance() {
        return balance;
    }
}
