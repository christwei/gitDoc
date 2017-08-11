package com.thread;

/**
 * Created by tangw on 2017/04/13.
 */
public class ThreadSafeTest implements  Runnable{

    public int num = 100;
    @Override
    public void run() {
        while (true) {
            if (num > 0) {

                System.out.println(Thread.currentThread().getName()+"  tickets:----------" + num--);
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();

        Thread t1 = new Thread(t, "thread1");
        Thread t2 = new Thread(t, "thread2");
        Thread t3 = new Thread(t, "thread3");
        Thread t4 = new Thread(t,  "thread4");
        Thread t5 = new Thread(t, "thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
