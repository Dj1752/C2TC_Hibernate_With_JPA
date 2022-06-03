package com.tns.corejava;
import java.util.Scanner;
 
   public class UserDefineException {
     public static void main(String ar[]) {
	    int Age;
	     System.out.println("Enter the age");
	     Scanner sc = new Scanner(System.in);
	     Age=sc.nextInt();
	     if(Age<18)
	     {
	    	 throw new CantVote("u cannot cast vote");
	     }
	     else
	     {
	    	 System.out.println("you can vote");
	     }
	 
 }
}
   class CantVote extends RuntimeException{
	   public CantVote (String msg) {
		   super(msg);
		   
	   }
   }
