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

    		//��������߽������Ĵ���
    		for(int j = 0; j < outchar.length ;j++){
    			int num = 1;

    			if (j == outchar.length - 1) {
    				outStr[i] +=  num;
    				outStr[i] += (outchar[j]-'0');
				}else{
					//�������if�жϣ��ĳ�while(j+1<length && c[j] = c[j+1]) ����
					//�����ж��Ⱥ��б� &&���������㷨�򣬱������ж� j+1 < length
	    			while(outchar[j] == outchar[j+1]){
	    				j += 1; //ѭ�����иı�ѭ�������������whileѭ���ˡ���Python���жϱ߽������ķ���������ã�������������һ���߽���ʲô�����
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
