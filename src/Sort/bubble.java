package Sort;

public class bubble implements Sort{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] bubbleSort(int[] num){
		for(int i = num.length -1  ; i > 0; --i){
			for(int j = 0 ; j < i ; j++){				
				if(num[j] > num[j+1]){
					int temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
				}
				
			}
		}
		return num;
	}
	public int[] bubbleSort2(int[] num){
		boolean flag;
		do{
			flag = false;
			for(int j = 0 ; j < num.length-1 ; j++){				
				if(num[j] > num[j+1]){
					int temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
					flag = true;
				}
			}
		}
		while(flag);
		return num;
	}
	@Override
	public int[] quickSort(int[] num) {
		//递归就肯定有递归截止条件
		int left = 0;
		int right = num.length;
		this.sort(num, left, right);
		for(int i = 0; i < num.length;i++){
			System.out.println(num[i]);
		}
		// TODO Auto-generated method stub
		return num;
	}
	public void sort(int[] num, int left,int right){
		if(left >= right){
			return;
		}
		int storeindex = this.partition(num, left, right);
		this.sort(num, left, storeindex-1); //storeindex本身是标杆后一位！（循环时是小于右侧值！）
		this.sort(num, storeindex, right);
	}
	public int partition(int[] num,int left,int right){
		int pivot = left;
		int storeindex = pivot+1;//从标杆后一个值开始比较！
		for(int i = storeindex; i < right;i++){
			if(num[i] < num[pivot]){ //小于标杆，比较值与左侧值交换
				int temp = num[storeindex];
				num[storeindex] = num[i];
				num[i] = temp;
				storeindex++;
			}
		}
		//将标杆值交换到争取的位置
		int temp = num[storeindex-1];
		num[storeindex-1] = num[pivot];
		num[pivot] = temp;		
		return storeindex;
	}
	
	
	@Override
	public int[] shellSort(int[] num) {
		
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int[] insertSort(int[] num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int[] heapSort(int[] num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int[] countSort(int[] num) {
		// TODO Auto-generated method stub
		return null;
	}

}
