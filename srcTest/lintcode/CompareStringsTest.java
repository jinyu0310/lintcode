package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompareStringsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompareStrings() {
		assertEquals(true, CompareStrings.compareStrings("ABCD", "ABC"));
	}
	
	@Test
	public void testCompareStrings1() {
		assertEquals(false, CompareStrings.compareStrings("ABCD", "AABC"));
	}

	@Test
	public void testCompareStrings2() {
		assertEquals(false, CompareStrings.compareStrings("", "AABC"));
	}
	@Test
	public void testCompareStrings3() {
		assertEquals(true, CompareStrings.compareStrings("ABCD", ""));
	
	
	}
	@Test
	public void testCompareStrings4() {
		String a = null;
		assertEquals(false, CompareStrings.compareStrings(a, "AABC"));
	}
	@Test
	public void testCompareStrings5() {
		String a = null;
		assertEquals(true, CompareStrings.compareStrings("ABCD", a));
	}
}
