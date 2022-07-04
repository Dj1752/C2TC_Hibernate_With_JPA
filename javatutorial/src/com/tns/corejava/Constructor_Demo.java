package com.tns.corejava;

public class Constructor_Demo {

	
        String name;
        int roll_no;
        Constructor_Demo(String name, int roll_no)
    	{
    		this.name=name;
    		this.roll_no=roll_no;
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Demo c1 = new Constructor_Demo("deepak", 17);
		Constructor_Demo c2 = new Constructor_Demo("sanket", 23);
		
		System.out.println(c1.name+" "+c1.roll_no);
		System.out.println(c2.name+" "+c2.roll_no);
		
	}

}
