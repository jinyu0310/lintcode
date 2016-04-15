package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsinaStringTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseWords1() {
		assertEquals(null, ReverseWordsinaString.reverseWords(null));
	}
	@Test
	public void testReverseWords2() {
		assertEquals("", ReverseWordsinaString.reverseWords(""));
	}
	@Test
	public void testReverseWords3() {
		assertEquals("", ReverseWordsinaString.reverseWords("  "));
	}
	@Test
	public void testReverseWords4() {
		assertEquals("sky blue the", ReverseWordsinaString.reverseWords("the blue sky"));
	}
	@Test
	public void testReverseWords5() {
		assertEquals("sky blue the", ReverseWordsinaString.reverseWords("the  blue sky  "));
	}
	@Test
	public void testReverseWords6() {
		assertEquals("sky blue the", ReverseWordsinaString.reverseWords("  the  blue sky  "));
	}
	@Test
	public void testReverseWords7() {
		assertEquals("thebluesky", ReverseWordsinaString.reverseWords("thebluesky  "));
	}
	@Test
	public void testReverseWords8() {
		assertEquals("thebluesky", ReverseWordsinaString.reverseWords("  thebluesky  "));
	}
	@Test
	public void testReverseWords9() {
		assertEquals("thebluesky", ReverseWordsinaString.reverseWords("thebluesky"));
	}
	@Test
	public void testReverseWords10() {
		assertEquals("a", ReverseWordsinaString.reverseWords("a"));
	}
	

}
