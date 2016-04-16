package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class strStrTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStrStr1() {
		assertEquals(-1, strStr.strStr(null,null));
	}
	@Test
	public void testStrStr2() {
		assertEquals(-1, strStr.strStr(null,"1"));
	}
	@Test
	public void testStrStr3() {
		assertEquals(-1, strStr.strStr("1",null));
	}
	@Test
	public void testStrStr4() {
		assertEquals(0, strStr.strStr("",""));
	}
	@Test
	public void testStrStr5() {
		assertEquals(-1, strStr.strStr("","1"));
	}
	@Test
	public void testStrStr6() {
		assertEquals(0, strStr.strStr("1",""));
	}
	@Test
	public void testStrStr7() {
		assertEquals(-1, strStr.strStr("abcd","acd"));
	}
	@Test
	public void testStrStr8() {
		assertEquals(2, strStr.strStr("abcdgd","cd"));
	}
	@Test
	public void testStrStr9() {
		assertEquals(1, strStr.strStr("acdcacd","cd"));
	}
	@Test
	public void testStrStr10() {
		assertEquals(-1, strStr.strStr("abcd","abcce"));
	}
	@Test
	public void testStrStr11() {
		assertEquals(0, strStr.strStr("lintcode","lintcode"));
	}

}
