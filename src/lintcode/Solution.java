package lintcode;

import java.util.Scanner;

public class Solution {
    public boolean Find(int [][] array,int target) {
    	return true;
    }
    
    public int mian(int [][]array){
    	Scanner input = new Scanner(System.in);
    	int num = 0;
    	int start = 0;
    	int next = 0;
    	while(input.hasNext()){
    		num = input.nextInt();
    		start = input.nextInt();
    		break;
    	}
    	
    	while(input.hasNext()){
    		next = input.nextInt();
    		if(start > next){
    			start += next;
    		}else{
    			start += GCD(start,next);
    		}
    	}
    	return start;
    }
    
    public int GCD(int start,int next){
    	while(next%start != 0){
    		next = start;
    		start = next%start;
    	}
    	return start;
    }
}
