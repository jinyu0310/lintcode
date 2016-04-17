package Sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class bubbleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBubbleSort() {
		int[] sortnum = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		int[] numsorted = busort.bubbleSort(num);
		for(int i = 0; i < sortnum.length; i++){
			assertEquals(sortnum[i], numsorted[i]);
		}

	}

	@Test
	public void testBubbleSort2() {
		int[] sortnum = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		int[] numsorted = busort.bubbleSort2(num);
		for(int i = 0; i < sortnum.length; i++){
			assertEquals(sortnum[i], numsorted[i]);
		}
	}
	
	@Test
	public void testQuickSort() {
		int[] sortnum = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		int[] numsorted = busort.quickSort(num);
		for(int i = 0; i < sortnum.length; i++){
			assertEquals(sortnum[i], numsorted[i]);
		}
	}
	
	@Test
	public void testSelectSort() {
		int[] sortnum = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		int[] numsorted = busort.selectSort(num);
		for(int i = 0; i < sortnum.length; i++){
			assertEquals(sortnum[i], numsorted[i]);
		}
	}
	
	@Test
	public void testInsertSort() {
		int[] sortnum = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		int[] numsorted = busort.insertSort(num);
//		for(int i = 0; i < numsorted.length;i++){
//			System.out.println(numsorted[i]);
//		}
		for(int i = 0; i < sortnum.length; i++){
			assertEquals(sortnum[i], numsorted[i]);
		}
	}
	
	@Test
	public void testShellSort() {
		int[] sortnum = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		int[] numsorted = busort.shellSort(num);
//		for(int i = 0; i < numsorted.length;i++){
//			System.out.println(numsorted[i]);
//		}
		for(int i = 0; i < sortnum.length; i++){
			assertEquals(sortnum[i], numsorted[i]);
		}
	}
	
	@Test
	public void testCreateMaxHeapOdd() {
		int[] MaxHeap = {10,9,7,6,8,4,1,3,5,2};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		busort.createMaxHeap(num);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	@Test
	public void testCreateMaxHeapEven() {
		int[] MaxHeap = {9,8,7,5,4,3,6,1,2};
		int[] num = {8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		busort.createMaxHeap(num);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	@Test
	public void testHeapModifyOdd() {
		int[] MaxHeap = {9,8,7,6,2,4,1,3,5};
		int[] num = {2,9,7,6,8,4,1,3,5};
		bubble busort = new bubble();
		busort.heapModify(num,num.length);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	@Test
	public void testHeapModifyEven() {
		int[] MaxHeap = {9,8,7};
		int[] num = {7,8,9};
		bubble busort = new bubble();
		busort.heapModify(num,num.length);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	@Test
	public void testHeapModifyOdd2() {
		int[] MaxHeap = {9,8};
		int[] num = {8,9};
		bubble busort = new bubble();
		busort.heapModify(num,num.length);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	//¶ÑÅÅÐò
	@Test
	public void testHeapSort() {
		int[] MaxHeap = {1,2,3,4,5,6,7,8,9,10};
		int[] num = {10,8,1,3,2,4,7,6,5,9};
		bubble busort = new bubble();
		busort.heapSort(num);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	
	@Test
	public void testMergeSort() {
		int[] MaxHeap = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] num = {10,8,1,3,2,4,7,6,5,9,12,11};
		bubble busort = new bubble();
		busort.mergeSort(num);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(num[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], num[i]);
		}
	}
	
	@Test
	public void testCountSort() {
		int[] MaxHeap = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] num = {10,8,1,3,2,4,7,6,5,9,12,11};
		bubble busort = new bubble();
		int[] numsorted = busort.countSort(num);
//		for(int i = 0; i < num.length;i++){
//			System.out.println(numsorted[i]);
//		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], numsorted[i]);
		}
	}
	
	@Test
	public void testBucketSort() {
		int[] MaxHeap = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] num = {10,8,1,3,2,4,7,6,5,9,12,11};
		bubble busort = new bubble();
		int[] numsorted = busort.bucketSort(num);
		for(int i = 0; i < num.length;i++){
			System.out.println(numsorted[i]);
		}
		for(int i = 0; i < MaxHeap.length; i++){
			assertEquals(MaxHeap[i], numsorted[i]);
		}
	}
	
}
