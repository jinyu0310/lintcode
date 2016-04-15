package lintcode;

import java.util.Scanner;

//提交到系统，3714,64这个测试用例出错，原因，不足3714个数字，导致程序无法结束。
//必须用一个数组先存下所有的输入数据！
public class wangyi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	int num = 0;
    	int start = 0;
    	int next = 0;
    	int i = 0;
    	while(input.hasNext()){
    		num = input.nextInt();
    		start = input.nextInt();
    		break;
    	}
    	
    	while(input.hasNext()){
    		next = input.nextInt();
    		if(start >= next){
    			start += next;
    		}else{
    			start += GCD(next,start);
    		}
    		i++;
    		if(i >= num){
    			break;
    		}
    	}
    	System.out.println(start);
    }
    
    private static int GCD(int next,int start){
    	int tmp;
    	while(start != 0){
    		tmp = start;
    		start = next%start;
    		next = tmp;
    	}
    	return next;
    }

    
    
}
