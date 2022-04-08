package DataStructure.Array;

public class TwoNumberProblem {

	public static void main(String[] args) {

		int nums[] = {2,7,10,19};
		int target =17;
		boolean notFound= false;
		
		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indexes are: "+i+", "+j);
                    notFound=true;
                }
            }
        }
		
		if (!notFound) {
			System.out.println("Not Found");
		}
	}

}
