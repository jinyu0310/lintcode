package lintcode;


public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    public static boolean compareStrings(String A, String B) {
    	if(A == null && B == null){
    		return true;
    	}
    	if(A.length() == 0 && B.length() == 0){
    		return true;
    	}
    	if(A == null || A.length() == 0){
    		return false;
    	}
    	if(B == null || B.length() == 0){
    		return true;
    	}
    	int[] num = new int[26];
    	for(char c:A.toCharArray()){
    		num[c-'A'] += 1;
    	}
    	for(char c:B.toCharArray()){
    		num[c-'A'] -= 1;
    		if(num[c-'A'] < 0){
    			return false;
    		}
    	}
		return true;
        // write your code here
    }

}
