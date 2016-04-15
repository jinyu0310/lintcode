package lintcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static ArrayList<String> longestWords(String[] dictionary) {
    	if(dictionary == null || dictionary.length == 0){
    		return null;
    	}
    	int Maxlength = 0;
    	//ArrayList<String> outStr = new ArrayList<String>();
    	HashMap<Integer, ArrayList<String>> outMap = new HashMap<Integer, ArrayList<String>>();
    	for(String s:dictionary){
    		int length = s.length();
    		if(outMap.containsKey(length)){
    			outMap.get(length).add(s);
    		}else{
        		ArrayList<String> outStr = new ArrayList<String>();
        		outStr.add(s);
    			outMap.put(length, outStr);
    		}    		
    		if(s.length() > Maxlength){
    			Maxlength = s.length();
    		}
    	}

    	return outMap.get(Maxlength);
        // write your code here
    }
    
    public static ArrayList<String> longestWords2(String[] dictionary) {
    	if(dictionary == null || dictionary.length == 0){
    		return null;
    	}
    	int Maxlength = 0;
    	ArrayList<String> outStr = new ArrayList<String>();
    	for(String s:dictionary){
    		if(s.length() > Maxlength){
    			Maxlength = s.length();
    		}
    	}
    	for(String s:dictionary){
    		if(s.length() == Maxlength){
    			outStr.add(s);
    		}
    	}
    	return outStr;
        // write your code here
    }
    
}
