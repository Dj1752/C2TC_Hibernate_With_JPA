package com.tns.corejava;

public class WaitSleep {

	private static Object waiting = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     Thread.sleep(2000);
     
     System.out.println(Thread.currentThread().getName()+"   " +"Thread is woken after two second");
     
     
     synchronized(waiting) {
    	 waiting.wait(2000);
    	 System.out.println(waiting +" "+"Object in waiting state and woken after two second");
     }
	}

}
