package lintcode;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

	}
	
    public static int lengthOfLastWord(String s) {
    	if(s == null || s.length() == 0){
    		return 0;
    	}
    	int length = s.length();
    	int i = length - 1;
		while(i >= 0 && s.charAt(i) == ' '){
			i--;
		}
		int behind = i;
		while(i >= 0 && s.charAt(i) != ' '){
			i--;
		}
		int before = i;
		if(behind >= 0){
			return s.substring(before+1,behind+1).length();//奇怪了，这里为什么要用子数组的长度，直接behind-before不就行了！！
		}
		return 0;
        // Write your code here
    }
}
