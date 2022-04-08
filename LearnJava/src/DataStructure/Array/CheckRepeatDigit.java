package DataStructure.Array;

public class CheckRepeatDigit {

	public static void main(String[] args) {

		int num[] = { 2230, 2254, 2244, 4420, 4444, 3344, 6644, 7443 };

		for (int k = 0; k < num.length; k++) {
			boolean duplicate = checkNumber(num[k]);
			if (duplicate) {
				System.out.println(num[k] + " contains 2 or more 4's");
			}
		}
	}

	private static boolean checkNumber(int i) {

		// char ch[] = (new String(String.valueOf(i))).toCharArray();
		String str = String.valueOf(i);
		char ch[] = str.toCharArray();
		int dup = 0;
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == '4') {
				dup++;
			}
		}
		return (dup >= 2 ? true : false);
	}

}
