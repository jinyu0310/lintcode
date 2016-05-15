package swordtooffer;

import java.util.Stack;


public class StackContainMin {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stackutil = new Stack<Integer>();
	Integer min = null;
	
    public void push(int node) {
    	this.stack1.push(node);
    	if(min == null){
    		min = node;
    	}else{
    		if(node < min){
    			min = node;
    		}
    		
    	}
    	stackutil.push(min);
    }
    
    public void pop() {
    	stack1.pop();
    	stackutil.pop();
    }
    
    public int top() {
		return stack1.peek();
        
    }
    
    public int min() {
    	return stackutil.peek();
        
    }

}
