package com.tns.corejava;

public class Abstract_Demo {

	public static void main(String[] args) {
		Scooty s1 = new com.tns.corejava.Scooty();
		s1.NoofWheel();

	}

}

abstract class Vehicle{
	public abstract void NoofWheel();
		
}

class Scooty extends Vehicle
{
  public void NoofWheel() {
	  System.out.println(2);
  }	
}
