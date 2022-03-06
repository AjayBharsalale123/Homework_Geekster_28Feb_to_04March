package hw_oop;

import java.util.Arrays;

public class hw02March {

	public static void main(String[] args) {
		
		
		String s="Hello how are you Contestant";
		System.out.println(truncateSentence(s,4));
		
		//int[]nums = {8,1,2,2,3};
		//System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

	}
	
	public static String truncateSentence(String s, int k) {
	    String[] words = s.split(" ");
	    String[] truncated = new String[k];

	    for (int i = 0; i < k; ++i)
	      truncated[i] = words[i];

	    return String.join(" ", truncated);
	  }
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {

        int output[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                    output[i] = count;
                }
            }
        }
        return output;
    }
	
//	public static void checkValid(String s) {
//		for(int i=0;i<s.length();i++) {
//		if (charAt(i)>= 'A' && charAt(i) <= 'Z')
//            System.out.println("\n" + ch +
//                    " is an UpperCase character");
//     
//        else if (ch >= 'a' && ch <= 'z')
//            System.out.println("\n" + ch +
//                    " is an LowerCase character" );
//     
//        else
//            System.out.println("\n" + ch +
//                    " is not an aplhabetic character" );
//    }
//	}
//	
//	private static boolean checkString(String str) {
//	    char ch;
//	    boolean capitalFlag = false;
//	    boolean lowerCaseFlag = false;
//	    boolean numberFlag = false;
//	    for(int i=0;i < str.length();i++) {
//	        ch = str.charAt(i);
//	        if( Character.isDigit(ch)) {
//	            numberFlag = true;
//	        }
//	        else if (Character.isUpperCase(ch)) {
//	            capitalFlag = true;
//	        } else if (Character.isLowerCase(ch)) {
//	            lowerCaseFlag = true;
//	        }
//	        if(numberFlag && capitalFlag && lowerCaseFlag)
//	            return true;
//	    }
//	    return false;
//	}

}



