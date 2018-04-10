package calculator.one;

public class SimpleCalc {
	
	
	public static void sum(int a, int b)
	{
	int sumA= a+b;
	System.out.println("Sum of a and b is : "+ sumA);
	}
	

	public static void divide(int a, int b)
	{
	int divideA= a/b;
	System.out.println("divide of a and b is : "+ divideA);
	}
	

	public static void multiply(int a, int b)
	{
	int multiplyA= a*b;
	System.out.println("multiply of a and b is : "+ multiplyA);
	}
	
	
	public static void main(String[] args) {
		
		sum(10,8);
		divide(22, 2);
		multiply(14,5);
	}
	
}