import org.junit.jupiter.api.*;

public class Demo_Test {
//@Test
@RepeatedTest(20)// for repeated test 
 void sum() {
	int a=10;
	int b=10;
	System.out.println(a+b);
	}
@Disabled
void Display() {
	System.out.println("a");
}
}
