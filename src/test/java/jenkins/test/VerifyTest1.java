package jenkins.test;
import calculator.one.*;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.xpandit.xray.*;
import com.xpandit.xray.util.*;


public class VerifyTest1 {

	//SimpleCalc sCalc = new SimpleCalc();
	//XRAYAJ
	@Test
		public static void Addition()
	{
		//SimpleCalc sCalc = new SimpleCalc();
		int addition= SimpleCalc.sum(10, 5);
		System.out.println("Sum of a and b is : "+ addition);
		 ITestResult result = Reporter.getCurrentTestResult();    
	        //result.setAttribute("requirement", "CALC-1234");
	        result.setAttribute("test", "XRAYAJ-3");
	       // result.setAttribute("labels", "core addition");
	}
	
	@Test
	public static void Division()
	{
	
		//SimpleCalc sCalcD = new SimpleCalc();
		int divide= SimpleCalc.divide(10, 5);
		System.out.println("divide of a and b is : "+ divide);
		 ITestResult result = Reporter.getCurrentTestResult();    
	        //result.setAttribute("requirement", "CALC-1234");
	        result.setAttribute("test", "XRAYAJ-2");
	}
	
	@Test
	//@Xray (test ="test1")
	public static void Multiplication()
	{
	
		//SimpleCalc sCalcM = new SimpleCalc();
		int multiplication= SimpleCalc.multiply(10, 5);
	System.out.println("multiply of a and b is : " +multiplication);
	 ITestResult result = Reporter.getCurrentTestResult();    
     //result.setAttribute("requirement", "CALC-1234");
     result.setAttribute("test", "XRAYAJ-1");
	} 
	
}
