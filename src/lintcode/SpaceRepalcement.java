package lintcode;

public class SpaceRepalcement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int replaceBlank(char[] string, int length) {
    	if(string == null){
    		return 0;
    	}
    	int blanknum = 0;
    	for(int i = 0; i < length ; i++){
    		if(string[i] == ' '){
    			blanknum++;
    		}
    	}
    	int newlength = length+blanknum*2;
    	int pos = newlength -1;
    	for(int i = length - 1; i >= 0 ; i--){
    		if(string[i] == ' '){
    			string[pos--] = '0';
    			string[pos--] = '2';
    			string[pos--] = '%';
    		}else{
    			string[pos--] = string[i];
    		}
    	}
    	
		return newlength;
        // Write your code here
    }

}
