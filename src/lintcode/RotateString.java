package lintcode;


public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = new char[]{'a','b','c','d','e','f','g'};
		RotateString.rotateString(str, 1);
    	for(char ca:str){
    		System.out.print(ca);
    	}
	}
    public static void rotateString(char[] str, int offset) {
    	if(str == null || str.length == 0){
    		return;
    	}
    	int length = str.length;
    	int splitplace = offset%str.length;
    	char temp;
    	for(int i = 0; i < splitplace;i++){
    		temp = str[length -1];
    		for(int j = length-2; j >= 0 ; j--){
    			str[j+1] = str[j];
    		}
    		str[0] = temp;
    	}

    	// write your code here
    }
    
    public static void rotateString2(char[] str, int offset) {
    	if(str == null || str.length == 0){
    		return;
    	}
    	int length = str.length;
    	int splitplace = offset%str.length;
    	char[] temp = new char[length];
    	for(int i = 0; i < length - splitplace;i++){
    		temp[splitplace+i] = str[i];
    	}
    	for(int i = length - splitplace; i < length ; i++){
    		temp[i - (length - splitplace)] = str[i];
    	}
    	for(int i = 0; i < length; i++){
    		str[i] = temp[i];
    	}
    	// write your code here
    }

}
