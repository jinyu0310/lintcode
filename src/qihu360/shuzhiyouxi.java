package qihu360;

import java.util.Scanner;

public class shuzhiyouxi {

	    public static void main(String[] args) {            
	        Scanner in = new Scanner(System.in);       
	        while(in.hasNext())
	        {
	        	int n = in.nextInt();
	        	int b = in.nextInt();
	        	int a = 0;
	        	if(b <= n/2){
	        		a = b + 1;
	        	}else {
	        		a = n-b+1;
	        		if(b-a-1>0){
		        		if((b-a-1)%2 == 0){
		        			a = a +(b-a-1)/2 + 1;
		        		}else{
		        			a = a +(b-a-1)/2;
		        		}
	        		}
				}
	        	System.out.println(a);              
	        }            
	    }

}


