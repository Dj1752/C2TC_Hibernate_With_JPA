package com.tns.corejava;

public class ExceptionHandling {
		public static void main(String ar[]) {
			int[] arr=new int[4];
			try {
				System.out.println(arr[4]);
				System.out.println("inside try block");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("inside catch block");
				//System.out.println(e);
			}
			finally {
				System.out.println("inide Finally block");
				
			}
			System.out.println("outside of try catch finally block...");
		}
	}


