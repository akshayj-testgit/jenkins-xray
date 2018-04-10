package jenkins.test;
import calculator.one.*;

//import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTest1 {

	//SimpleCalc sCalc = new SimpleCalc();
	
	@Test
	public static void Addition()
	{
		//SimpleCalc sCalc = new SimpleCalc();
		int addition= SimpleCalc.sum(10, 5);
		System.out.println("Sum of a and b is : "+ addition);
	
	}
	
	@Test
	public static void Division()
	{
	
		//SimpleCalc sCalcD = new SimpleCalc();
		int divide= SimpleCalc.divide(10, 5);
		System.out.println("divide of a and b is : "+ divide);
	}
	
	@Test
	public static void Multiplication()
	{
	
		//SimpleCalc sCalcM = new SimpleCalc();
		int multiplication= SimpleCalc.multiply(10, 5);
	System.out.println("multiply of a and b is : " +multiplication);
	} 
	
}
