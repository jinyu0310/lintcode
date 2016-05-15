package swordtooffer;

public class MinNumberOfCycleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//变化的二分查找递归；递归结束，left=right;
    public int minNumberInRotateArray(int [] array) {
		return find(0, array.length-1, array);
    }
    
    public  int find(int left,int right, int [] array) {
    	if(left >= right){
    		return array[left];
    	}
    	int mid = left + (right - left)/2;
    	if(array[mid] > array[left] && array[mid] < array[right] && array[left] != array[right]){
    		return array[left];
    	}else if(array[mid] > array[left] && array[mid] > array[right]){
    		return find(mid,right,array);
    	}else{
    		return find(left,mid,array);
    	}
	}

}
