package lintcode;

import java.util.Stack;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public static boolean isPalindrome(String s) {
    	if(s == null){
    		return false;
    	}
    	if(s.length() == 0){
    		return true;
    	}
    	String lowerceses = s.toLowerCase();
    	Stack<Character> charstack = new Stack<Character>();
    	
    	
		return true;
        // Write your code here
    }
    
    public static boolean isPalindrome2(String s) {
    	if(s == null){
    		return false;
    	}
    	if(s.length() == 0){
    		return true;
    	}
    	String lowerceses = s.toLowerCase();
    	int left = 0;
    	int right = lowerceses.length() - 1;
		char leftchar = lowerceses.charAt(left);
		char rightchar = lowerceses.charAt(right);
    	while(left <= right){
    		while(!((leftchar - 'a' >=0 && leftchar - 'a' < 26) || 
    				(leftchar - '0' >= 0 && leftchar - '0' < 10)) 
    				&& left < lowerceses.length()-1){
    			left++;
    			leftchar = lowerceses.charAt(left);
    		}
    		while(!((rightchar - 'a' >=0 && rightchar - 'a' < 26) || 
    				(rightchar - '0' >= 0 && rightchar - '0' < 10))
    				&& right > 0){
    			right--;
    			rightchar = lowerceses.charAt(right);
    		}
    		if(left >= right){
    			return true;
    		}
    		if(leftchar != rightchar){
    			return false;
    		}
			left++;
			leftchar = lowerceses.charAt(left);
			right--;
			rightchar = lowerceses.charAt(right);
    	}
    	
		return true;
        // Write your code here
    }
}
