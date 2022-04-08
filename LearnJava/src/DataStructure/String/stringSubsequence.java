package DataStructure.String;

public class stringSubsequence {
	
	public static boolean checkSubSequence(String A, String B){
        if(A==null || B==null)
            return false;

        String longer = A.length()>B.length() ? A : B;
        String shorter = A.length()<=B.length() ? A : B;

        int j = 0;
        for (int i = 0; i < longer.length() && j < shorter.length(); i++) {
            if (longer.charAt(i) == shorter.charAt(j))
                j++;
        }

        //check if all are matched
        if(j==shorter.length())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String A = "abcdef";
        String B = "abc";
        System.out.println(checkSubSequence(A, B));
        System.out.println(checkSubSequence(B, A));
    }
}
