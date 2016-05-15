package swordtooffer;

import java.util.LinkedList;
import java.util.Queue;

public class ChangeOddBeforeEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static void reOrderArray(int [] array) {
        Queue<Integer> queueEven = new LinkedList<Integer>();
        Queue<Integer> queueodd = new LinkedList<Integer>();
        int evennum = 0;
        for(int e:array){
        	if(isEven(e)){
        		queueEven.add(e);
        		evennum++;
        	}else {
				queueodd.add(e);
			}
        }
    	int length = array.length;
    	for(int i = 0; i < evennum ; i++){
    		array[i] = queueEven.poll();
    	}
    	for(int i = evennum; i < length ; i++){
    		array[i] = queueodd.poll();
    	}
    }
    
    public static boolean isEven(int n) {
		return (n&1) == 1;
	}
}
