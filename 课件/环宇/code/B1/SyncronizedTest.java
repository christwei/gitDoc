package com.thread;

/**
 * Created by tangw on 2017/04/13.
 */
public class SyncronizedTest implements  Runnable{
    
    
    
    public Account account;
    
    public SyncronizedTest(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (this.account) {
            
        
            while (true) {
                if (this.account.num > 0) {
    
                    System.out.println(Thread.currentThread().getName()+"  tickets:----------" + this.account.num--);
                } else {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.num = 1000;
        SyncronizedTest t = new SyncronizedTest(acc);

        Thread t1 = new Thread(t, "thread1");
        Thread t2 = new Thread(t, "thread2");
        Thread t3 = new Thread(t, "thread3");
        Thread t4 = new Thread(t, "thread4");
        Thread t5 = new Thread(t, "thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}


