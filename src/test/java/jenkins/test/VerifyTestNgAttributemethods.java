package jenkins.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import calculator.one.SimpleCalc;

import org.testng.Reporter;

import com.xpand.annotations.Xray;

public class VerifyTestNgAttributemethods {
	
	@BeforeSuite
    public void setUp_Xray() throws Exception {
 
    }
 
    @AfterSuite
    public void tearDown_Xray() throws Exception {
    }
    
	@Test  
	@Xray(labels = "To be created New :XRay Test1")
	public static void SumOfTwoIntegers_Xray()
	{
	
	int addition= SimpleCalc.sum(10, 5);
	System.out.println("Sum of a and b is : "+ addition);
	System.out.println("Test to be crated automatically : ");
	
	}
	
	
@Test
@Xray(test = "@QAT-350", labels = "Existing XRay Test")
	public static void DivisionOfTwoIntegers_XRay()
	{
	
	int divide= SimpleCalc.divide(10, 5);
	System.out.println("divide of a and b is : "+ divide);
	
	}
	
@Test
@Xray(labels = "To be created New :XRay Test2")
	public static void MultiplicationOfTwoIntegers_Xray()
	{
	int multiplication= SimpleCalc.multiply(10, 5);
	System.out.println("multiply of a and b is : "+ multiplication);
	
	}
	
}
