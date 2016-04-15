package lintcode;




public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountAndSay.countAndSay(1));
	}

    /**
     * @param n the nth
     * @return the nth sequence
     */
    public static String countAndSay(int n) {
    	String[] outStr = new String[n];
    	outStr[0] = "1";

    	for(int i = 1; i < n; i++){
    		outStr[i] = "";
    		char[] outchar = outStr[i-1].toCharArray();

    		//又是这里，边界条件的处理
    		for(int j = 0; j < outchar.length ;j++){
    			int num = 1;

    			if (j == outchar.length - 1) {
    				outStr[i] +=  num;
    				outStr[i] += (outchar[j]-'0');
				}else{
					//整个这个if判断，改成while(j+1<length && c[j] = c[j+1]) 即可
					//这里判断先后有别， &&从左到右运算法则，必须先判断 j+1 < length
	    			while(outchar[j] == outchar[j+1]){
	    				j += 1; //循环体中改变循环变量，最好用while循环了。（Python中判断边界条件的方法比这个好！！考虑清楚最后一个边界是什么情况）
	    				num += 1;
	    				if(j == outchar.length - 1){
	    					break;
	    				}
	    			}
    				outStr[i] +=  num;
    				outStr[i] += (outchar[j]-'0');
				}
    		}
    	}


		return outStr[n-1];
    }
	
	
}
