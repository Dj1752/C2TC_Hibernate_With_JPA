package com.tns.corejava;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;

public class Concurrent_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReentrantLock l = new ReentrantLock();
System.out.println(l.isLocked());
System.out.println(l.isHeldByCurrentThread());
System.out.println(l.getQueueLength());



	}

}
