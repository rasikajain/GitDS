package DataStructure.String;

public class printAlphabets {

	public static void main(String[] args) {
		char ch;
		
		for(ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//This Java program iterates the ASCII codes from 65 to 90, 
		//representing the alphabets A to Z, and prints them
		for(int i = 65; i <= 90; i++) 
		{
			System.out.printf("%c ", i);
		}
		System.out.println();
	}

}
