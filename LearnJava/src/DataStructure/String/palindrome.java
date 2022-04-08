package DataStructure.String;

public class palindrome {

	public static void main(String[] args) {


		String palindrome = "Dot saw I was Tod";

		StringBuilder sb = new StringBuilder(palindrome);

		sb.reverse();  // reverse it

		System.out.println(sb);
		//		Note that println() prints a string builder, as in:
		//	System.out.println(sb);	because sb.toString() is called implicitly
	}

}












//private static String isPalindrome(String s) {

//		return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())?"Palindrome":"Not Palindrome";
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(isPalindrome("MADAM"));
//	}