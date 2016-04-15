package lintcode;

import java.util.regex.Pattern;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseWordsinaString.reverseWords("  "));
	}
    public static String reverseWords(String s) {
    	if(s == null){
    		return null;
    	}
    	if(s.length() == 0){
    		return "";
    	}
    	StringBuilder outStrB = new StringBuilder();
    	String[] ssplit = s.split(" +");
    	for(int i = ssplit.length - 1 ; i > 0 ; i--){
    		outStrB.append(ssplit[i]);
    		outStrB.append(' ');
    	}
    	if(ssplit.length > 0 && ssplit[0].length() > 0){
    		outStrB.append(ssplit[0]);
    	}else if (outStrB.length() > 0 ){
    		outStrB.deleteCharAt(outStrB.length()-1);
    	}
    	String outStr = new String(outStrB);
    	return outStr;
 
    }
    
    public static String reverseWords2(String s) {
    	if(s == null){
    		return null;
    	}
    	if(s.length() == 0){
    		return "";
    	}
    	StringBuilder outStrBuilder = new StringBuilder();
    	int length = s.length()-1;
    	while(length >= 0){
    		while(length >= 0 && s.charAt(length) == ' '){
    			length -= 1;
    		}
    		int behind = length;
    		while(length >= 0 && s.charAt(length) != ' '){
    			length -= 1;
    		}
    		int before = length;
    		if(behind >= 0 && before >= 0){
    			outStrBuilder.append(s.substring(before+1,behind+1)); 
    			outStrBuilder.append(' ');
    		}
    		if(behind >= 0 && before < 0){
    			outStrBuilder.append(s.substring(before+1,behind+1)); 
    		}
    		if(behind < 0 && before < 0 && outStrBuilder.length() > 0){
    			outStrBuilder.deleteCharAt(outStrBuilder.length()-1);
    		}

    	}
    	String outStr = new String(outStrBuilder);
 		return outStr;
        // write your code
    }
}
