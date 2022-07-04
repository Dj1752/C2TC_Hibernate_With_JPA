package com.tns.corejava;

public class Multi_Threading {

	public static void main(String[] ar) throws InterruptedException{
		MyThread t1 = new MyThread();
		Thread t= new Thread();
		t.start();
		
		t.join();
		for (int i=0; i<5;i++) {
			System.out.println("a");
		}
	}
}

class MyThread implements Runnable{
	public void run() {
		for (int i=0; i<5;i++) {
			System.out.println("b");
		}
	}
}