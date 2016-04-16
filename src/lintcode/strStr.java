package lintcode;

public class strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public static int strStr(String source, String target) {
    	if(source == null || target == null){
    		return -1;
    	}
    	int slength = source.length();
    	int tlength = target.length();
    	if(tlength == 0){
    		return 0;
    	}
    	if(slength == 0 || slength < tlength){
    		return -1;
    	}
    	int flag;
    	for(int i = 0; i < slength-tlength+1; i++){
    		flag = 0;
    		for(int j = 0; j < tlength; j++){
    			int k = i;
    			if(source.charAt(k+j) != target.charAt(j)){
    				flag = 1;
    				break;
    			}
    		}
    		if(flag == 0){
    			return i;
    		}
    	}
    	
        return -1;
    }
}
