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
		for(int i = 0; i < numsorted.length;i++){
			System.out.println(numsorted[i]);
		}
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

}
