package ConditionOperation;

public class IfClass {

	public static void main(String[] args) {
// if condition		int age = 20;
//		if(age >= 18)
//		{
//			System.out.println("you can vote now");
//		}
//if-else condition
//		int noOfPetals = 12;
//		if(noOfPetals%2 ==0)
//		{
//			System.out.println("she love u");
//			
//		}
//		else {
//			System.out.println("she love u not");
//			
//		}

//	else-if condition
//		int number  = 22;
//		if(number <= 10)
//		{
//			System.out.println("the number is less than 10");
//					}
//       else if (number >=10 && number <20 ){
//		System.out.println("number is lies between 10 -20");
//		
//		}
//		else if (number >=20 && number <30 ){
//			System.out.println("number is lies between 20 -30");
//			
//		}
//		else {
//			System.out.println("the number is greater than 30");
//		}
		
//ternary operator
//	int a = 15;
//	int b =8;
//	
//	int c = a>b ? a:b;
//	System.out.println(c);
		
//	nested if else
		int a=12,b=8,c=10;
		int result = 0;
		
		if (a>b){
			if(a>c) {
				result =a;
			}else {
				result=c;
			}
		}
		 System.out.println(result); 
	}

}
