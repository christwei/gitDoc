package com.thread;

 class ThreadTest extends Thread { // 指定类继承Thread类
	private int count = 100000;
	
	public void run() { // 重写run()方法
		while (true) {
			System.out.print(count+" "); // 打印count变量
			try {
                //Thread.sleep(200);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
			if (--count == 0) { // 使count变量自减，当自减为0时，退出循环
				return;
			}
		}
	}
	
	public static void main(String[] args) {
	    new ThreadTest().start();
	    System.out.println("hello multithread!");
		
	}
}
