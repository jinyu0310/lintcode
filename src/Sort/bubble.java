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
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
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
		int length = num.length;
		int gap = (int) Math.floor(length/2);
		while(gap > 0){
//			System.out.println(gap);
			for(int i = gap; i < length ; i++){
//				int tempplace = i;
				int temp = num[i];
				int place = i-gap; //这里初始化条件对shell和insert也有影响。妈的，除了while循环！
				//
				for(int j = i; j > (gap-1); j -= gap ){
					if(temp < num[j-gap]){
						num[j] = num[j-gap];
					}else{
						place= j;
						break;
					}
				}	
				num[place] = temp;
//				while(tempplace > (gap-1) && temp < num[tempplace-gap]){
//					num[tempplace] = num[tempplace-gap];
//					tempplace -= gap;
//				}
//				num[tempplace] = temp;
			}
			gap = (int) Math.floor(gap/2);
		}
		
		return num;
	}
	@Override
	public int[] insertSort(int[] num) {
		// TODO Auto-generated method stub
		int length = num.length;
		for(int i = 1;i < length;i++){
//			int tempplace = i;
//			int temp = num[i];
//			while(tempplace > 0 && temp < num[tempplace-1]){
//				num[tempplace] = num[tempplace-1];
//				tempplace--;
//			}
//			num[tempplace] = temp;

			int temp = num[i];
//			System.out.println(temp);
			int place = 0;
			for(int j = i; j > (1-1); j -= 1 ){
				if(temp < num[j-1]){
					num[j] = num[j-1];
				}else{
					place = j;
//					num[place-1] = temp;
					break;
				}
			}
			num[place] = temp;
		}
		return num;
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

	public void swap(int[] num, int i, int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	@Override
	public int[] selectSort(int[] num) {
		int length = num.length;
		for(int i = 0; i < length; i++){
			int minnum = i;
			for(int j = i+1; j < length; j++){
				if(num[j] < num[minnum]){
					minnum = j;
				}
			}
			swap(num, i, minnum);
		}
		return num;
	}
	@Override
	public int[] radixSort(int[] num) {
		
		
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int[] bucketSort(int[] num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int[] mergeSort(int[] num) {
		// TODO Auto-generated method stub
		return null;
	}
}
