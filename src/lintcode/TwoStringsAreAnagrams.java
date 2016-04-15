package lintcode;

public class TwoStringsAreAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean anagram(String s, String t) {
    	if(s == null || t == null){
    		return false;
    	}
    	if(s.length() != t.length()){
    		return false;
    	}
    	int length = s.length();
    	int[] charnum = new int[256];
    	for(int i = 0; i < length ;i++){
    		charnum[s.charAt(i)-0] += 1;
    	}
    	for(int i = 0; i < length ;i++){
    		charnum[t.charAt(i)-0] -= 1;
    		if(charnum[t.charAt(i)-0] < 0){
    			return false;
    		}
    	}
		return true;
        // write your code here
    }
}
