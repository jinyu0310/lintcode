package lintcode;

import java.util.Scanner;

public class sixtento10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	int outputint = 0;
            String numH = in.next();
            for(int i = numH.length()-1 ;i >= 2 ;i--){
            	char num = numH.charAt(i);
            	int numi = 0;
            	if(num>='A'){
            		numi = (num-'A')+10;
            	}else {
					numi = num-'0';
				}
            	outputint = (int) (outputint + numi*Math.pow(16, numH.length()-1-i));
            }
            System.out.println(""+outputint);
        }
	}
}
