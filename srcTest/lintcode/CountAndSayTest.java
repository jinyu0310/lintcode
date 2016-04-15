package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountAndSayTest {
	private int i = 0;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCountAndSay() {
		assertEquals("1", CountAndSay.countAndSay(1));
	}
	@Test
	public void testCountAndSay1() {
		assertEquals("11", CountAndSay.countAndSay(2));
	}
	@Test
	public void testCountAndSay2() {
		assertEquals("21", CountAndSay.countAndSay(3));
	}
	@Test
	public void testCountAndSay3() {
		assertEquals("1211", CountAndSay.countAndSay(4));
	}

}
