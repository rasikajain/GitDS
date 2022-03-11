package DataStructure.Recursion;

public class SumofNaturalNumbers {

	private long sumOfNums(int n) {

		//How to calculate sum of Natural Numbers: n=n(n+1)/2
		//Using recursion n = n+sum(n-1)
		//For Ex: 6 = 6+5+4+3+2+1 = 21
		
		long fact=0;
		if (n==1){
			fact=1;
		}
		else {
			fact=n+sumOfNums(n-1);
		}
		
		return fact;

	}
	public static void main(String[] args) {

		SumofNaturalNumbers sum = new SumofNaturalNumbers();
		System.out.println("The sum of natural numbers is: " + sum.sumOfNums(6));

	}

}
