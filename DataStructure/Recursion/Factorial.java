package DataStructure.Recursion;

public class Factorial {

	private long computeFactorial(int n) {
		
		//How to calculate factorial =  n!=n*(n-1)!
		//For Ex: 3! = 3*2! = 3*2*1! = 3*2*1=6
		long fact=0;
		if (n==1)
		{
			fact=1;
		}
		else 
		{
			fact=n*computeFactorial(n-1);
		}
		
		return fact;

	}

	public static void main(String[] args)
	{
		Factorial f = new Factorial();
		System.out.println("The Factorial of number is: " + f.computeFactorial(3));
	}	
}
