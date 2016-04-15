package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LengthofLastWordTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLengthOfLastWord() {
		assertEquals(0, LengthofLastWord.lengthOfLastWord(null));
	}
	@Test
	public void testLengthOfLastWord1() {
		assertEquals(0, LengthofLastWord.lengthOfLastWord(""));
	}
	@Test
	public void testLengthOfLastWord2() {
		assertEquals(0, LengthofLastWord.lengthOfLastWord("  "));
	}
	@Test
	public void testLengthOfLastWord3() {
		assertEquals(3, LengthofLastWord.lengthOfLastWord("abc abc"));
	}
	@Test
	public void testLengthOfLastWord4() {
		assertEquals(3, LengthofLastWord.lengthOfLastWord("abc abc "));
	}
	@Test
	public void testLengthOfLastWord5() {
		assertEquals(3, LengthofLastWord.lengthOfLastWord("abc abc  "));
	}
	@Test
	public void testLengthOfLastWord6() {
		assertEquals(3, LengthofLastWord.lengthOfLastWord("abc"));
	}
	@Test
	public void testLengthOfLastWord7() {
		assertEquals(1, LengthofLastWord.lengthOfLastWord("a"));
	}

}
