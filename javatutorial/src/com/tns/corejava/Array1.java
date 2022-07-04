package com.tns.corejava;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int size;
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the size of array");
         size = s.nextInt();
         int[] array = new int[10];
          System.out.println("Enter the element of the array: ");
          for (int i=0; i<size; i++) {
        	  array[i]= s.nextInt();
        	  
          }
          
          for (int i=0; i<size; i++) {
        	System.out.println(array[i]);
        	  
          }
	}

}
