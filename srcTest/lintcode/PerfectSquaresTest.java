package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectSquaresTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testNumSquares1() {
//		System.out.println(PerfectSquares.numSquares(12));
//		assertEquals(3, PerfectSquares.numSquares(12));
//	}
//	
//	@Test
//	public void testNumSquares2() {
//		assertEquals(2, PerfectSquares.numSquares(13));
//	}
//
//	@Test
//	public void testNumSquares3() {
//		System.out.println(PerfectSquares.numSquares(2));
//		assertEquals(2, PerfectSquares.numSquares(2));
//	}
	
//	@Test
//	public void testNumSquares4() {
////	System.out.println((int)Math.sqrt(84736));
//		int x = PerfectSquares.numSquares(84736);
//		System.out.println(x);
//		assertEquals(3, x);
//	}
	
//	@Test
//	public void testNumSquares5() {
////		System.out.println((int)Math.sqrt(84736));
//		int x = PerfectSquares.numSquares(42);
//		System.out.println(x);
//		assertEquals(3, x);
//	}
	
	@Test
	public void testNumSquares6() {
//		System.out.println((int)Math.sqrt(84736));
		int x = PerfectSquares.numSquaresDP(43);
		System.out.println(x);
		assertEquals(3, x);
	}
}
