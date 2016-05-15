package swordtooffer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinNumberOfCycleArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMinNumberInRotateArray() {
		MinNumberOfCycleArray minNumberOfCycleArray = new MinNumberOfCycleArray();
		int [] array1 = new int[]{2,2,1,2,2,2};
		int minnumber = minNumberOfCycleArray.minNumberInRotateArray(array1);
		System.out.println(minnumber);
		assertEquals(1, minnumber);	
	}

}
