package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import mogujie.first;

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
		//�ݹ�Ϳ϶��еݹ��ֹ����
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
		this.sort(num, left, storeindex-1); //storeindex�����Ǳ�˺�һλ����ѭ��ʱ��С���Ҳ�ֵ����
		this.sort(num, storeindex, right);
	}
	public int partition(int[] num,int left,int right){
		int pivot = left;
		int storeindex = pivot+1;//�ӱ�˺�һ��ֵ��ʼ�Ƚϣ�
		for(int i = storeindex; i < right;i++){
			if(num[i] < num[pivot]){ //С�ڱ�ˣ��Ƚ�ֵ�����ֵ����
				int temp = num[storeindex];
				num[storeindex] = num[i];
				num[i] = temp;
				storeindex++;
			}
		}
		//�����ֵ��������ȡ��λ��
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
				int place = i-gap; //�����ʼ��������shell��insertҲ��Ӱ�졣��ģ�����whileѭ����
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
		createMaxHeap(num);//��������
		int length = num.length;
		for(int i = length - 1; i > 0 ; i--){
			swap(num, 0, i);
			heapModify(num, i); //���ѵ���
		}
		return num;
	}
	
	//�ѵĴ�С����������ż����������ʽӦ���ǲ�һ����
	//�������ѡ���������һ������Ҫ���ӽڵ�Ƚϵģ���whileѭ����
	//����Ҳû�п��ǳ���С��3ʱ�����
	public void createMaxHeap(int[] num){
		int length = num.length;
		int oddOrEven = length%2;
		if(oddOrEven == 1){
			createMaxHeapFull(num,length);
		}else{
			int fatherpos = Math.floorDiv(length-1,2);
			if(num[length-1] > num[fatherpos]){
				swap(num, length-1, fatherpos);
			}
			createMaxHeapFull(num,length-1);
		}		
	}
	//���нڵ�Ķȶ�Ϊ2ʱ����������
	public void createMaxHeapFull(int[] num,int length){
		int childmax = 0;
		int fatherpos = 0;
		for(int i = length - 1; i > 1; i -= 2){
			int child = i;
			do{
				if(num[child] > num[child-1]){
					childmax = child;
				}else{
					childmax = child-1;
				}
				fatherpos = Math.floorDiv(childmax-1,2);
				if(num[childmax] > num[fatherpos]){
					swap(num, childmax, fatherpos);
				}
				child = (childmax+1)*2; //����ӽڵ����������С���ӽڵ�û�ж�����
			}while(child < length);
		}
	}
	//��ͷ��㿪ʼ���ѵ��������������е�do while ѭ���е�����
	//���ѵ�����ֻ�и��ڵ㲻������������ʱ�Ը��ڵ�ĵ�������������ʵ�ֲ���Ԫ��
	//����Ԫ����С��3ʱ�����ӽڵ㲻���ڣ��±�Խ��
	public void heapModify(int[] num, int length){
		if(length == 1){
			return;
		}
		if(length == 2){
			if(num[0] < num[1]){
				swap(num, 0, 1);
				return;
			}else{
				return;
			}
		}
		int fatherpos = 0;
		int child = (fatherpos+1)*2; //ֻ�������ڵ�ʱ�ʹ���
		int childmax = 0;
		do{
			if(num[child] > num[child-1]){
				childmax = child;
			}else{
				childmax = child-1;
			}
			fatherpos = Math.floorDiv(childmax-1,2);
			if(num[childmax] > num[fatherpos]){
				swap(num, childmax, fatherpos);
			}
			child = (childmax+1)*2; //����ӽڵ����������С���ӽڵ�û�ж�����
		}while(child < length);	
	}
	
	
	@Override
	public int[] countSort(int[] num) {
		// TODO Auto-generated method stub
		int length = num.length;
		int[] num2 = new int[length];
		int min = num[0],max = num[0];
		for(int i = 0; i < length; i++){
			if(num[i] < min){
				min = num[i];
			}else if(num[i] > max){
				max = num[i];
			}
		}
		int[] utilNum = new int[max];
		for(int i = 0; i < length; i++){
//			System.out.println(num[i]);
			utilNum[num[i]-1]++;
		}
		for(int i = 1; i < utilNum.length;i++){
			utilNum[i] = utilNum[i] + utilNum[i-1];
		}
		for(int i = length-1; i >= 0; i--){
//			System.out.println(num[i]);
//			System.out.println(utilNum[num[i]-1]);
			num2[utilNum[num[i]-1]-1] = num[i];
			utilNum[num[i]-1]--;
//			System.out.println(utilNum[num[i]-1]);
		}
		//����ʵ�ַ�ʽԪ�ض������ˣ�̸�����ȶ����ȶ��˰ɣ���
//		int index = 0;
//		for(int i = 0; i < utilNum.length;i++){
//			while(utilNum[i] > 0){
//				num[index] = i;
//				utilNum[i]--;
//				index++;
//			}
//		}
		
		return num2;
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
	
	//Ͱ�ĸ������ȷ����
	@Override
	public int[] bucketSort(int[] num) {
		// TODO Auto-generated method stub
		int length = num.length;
		int min = num[0],max = num[0];
		for(int i = 0; i < length; i++){
			if(num[i] < min){
				min = num[i];
			}else if(num[i] > max){
				max = num[i];
			}
		}
		int bucketnum = length/3;
		//����ÿ��Ͱ�����Ӧ����Ҫ������ʵ�ֵ�
		ArrayList[] bucket = new ArrayList[bucketnum];
		for(int i = 0; i < length; i++){
			if(bucket[num[i]/bucketnum] == null){
				ArrayList<Integer> numi = new ArrayList<Integer>();
				numi.add(num[i]);
				bucket[num[i]/bucketnum] = numi;
			}else{
				bucket[num[i]/bucketnum].add(num[i]);
			}
		}
		ArrayList<Integer> sortednum = new ArrayList<Integer>();
		for(int i = 0; i < bucketnum;i++){
			Collections.sort(bucket[i]);
			Iterator<Integer> it = bucket[i].iterator();
			while(it.hasNext()){
				sortednum.add(it.next());
			}
		}
		Integer[] sortedn = (Integer[])sortednum.toArray(new Integer[length]);
		for(int i = 0; i < length;i++){
			num[i] = sortedn[i];
		}
		
		return num;
	}
	@Override
	public int[] mergeSort(int[] num) {
		// TODO Auto-generated method stub
		int length = num.length;
		merge(num, 0, length);
		return num;
	}
	
	//�е㲻̫�ԣ���ô�ü��ε���˳��û�б仯������Ȼ����ȷ�����ˣ���
	//����鲢����ʵ�ֵľ��Բ��ԣ���
	private int flag = 0;
	public void merge(int[] num, int left, int right){
		if(left >= right - 1){
			return;
		}
		int mid = left + (right - left)/2;
		merge(num, left, mid);
		merge(num, mid+1, right);
		insertSort2(num, left, right);
//		System.out.println("��"+flag+"�ε���");
//		flag++;
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
	}
	public void insertSort2(int[] num,int left,int right) {
		// TODO Auto-generated method stub
		for(int i = left+1;i < right;i++){
			int temp = num[i];
			int place = left;
			for(int j = i; j > (1-1); j -= 1 ){
				if(temp < num[j-1]){
					num[j] = num[j-1];
				}else{
					place = j;
					break;
				}
			}
			num[place] = temp;
		}
	}
}
