package jenkins.test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.XMLReporter;

import calculator.one.SimpleCalc;


public class VerifyTest1 {

	//SimpleCalc sCalc = new SimpleCalc();
	//XRAYAJ
	  @BeforeSuite
	    public void setUp() throws Exception {
	 
	    }
	 
	    @AfterSuite
	    public void tearDown() throws Exception {
	    }
	
	@Test
		public static void Addition()
	{
		//SimpleCalc sCalc = new SimpleCalc();
		int addition= SimpleCalc.sum(10, 5);
		System.out.println("Sum of a and b is : "+ addition);
		ITestResult result = Reporter.getCurrentTestResult();    
	        //result.setAttribute("requirement", "CALC-1234");
	       // result.setAttribute("test", "XRAYAJ-1");
	       // result.setAttribute("labels", "core addition");
	}
	
	@Test
	public static void Division()
	{
	
		//SimpleCalc sCalcD = new SimpleCalc();
		int divide= SimpleCalc.divide(10, 5);
		System.out.println("divide of a and b is : "+ divide);
		// ITestResult result = Reporter.getCurrentTestResult();    
		 //Assert.assertNotEquals(true, true);
		 //Assert.assertEquals(divide, 2);
		Assert.assertEquals(divide, 2); 
		 ITestResult result = Reporter.getCurrentTestResult();
		  result.setAttribute("labels", "core addition");
		//result.setAttribute("requirement", "CALC-1234");
		  //result.setAttribute("test", "XRAYAJ-2");
		  
	}
	
	@Test
	//@Xray (test ="test1")
	public static void Multiplication()
	{
	
		//SimpleCalc sCalcM = new SimpleCalc();
		int multiplication= SimpleCalc.multiply(10, 5);
		 ITestResult result = Reporter.getCurrentTestResult();
		 System.out.println("multiply of a and b is : " +multiplication);
     //result.setAttribute("requirement", "CALC-1234");
    result.setAttribute("test", "XRAYAJ-3");
	} 
	
}
