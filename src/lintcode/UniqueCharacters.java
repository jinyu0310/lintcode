package lintcode;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean isUnique(String str) {
    	if(str == null || str.length() == 0){
    		return false;
    	}
    	int[] charnum = new int[256];
    	for(int i = 0; i < str.length();i++){
    		charnum[str.charAt(i)-0] += 1;
    		if(charnum[str.charAt(i)-0] > 1){
    			return false;
    		}
    	}
		return true;
    	
        // write your code here
    }

}
