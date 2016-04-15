package lintcode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LongestWordsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLongestWords1() {
		String[] str = null;
		assertEquals(null, LongestWords.longestWords(str));
	}
	@Test
	public void testLongestWords2() {
		String[] str = new String[0];
		assertEquals(null, LongestWords.longestWords(str));
	}
	@Test
	public void testLongestWords3() {
		String[] str = new String[]{  "dog",
			  "google",
			  "facebook",
			  "internationalization",
			  "blabla"};
		ArrayList<String> outStr = new ArrayList<String>();
		outStr.add("internationalization");
		assertEquals(outStr, LongestWords.longestWords(str));
	}
	@Test
	public void testLongestWords4() {
		String[] str = new String[]{  "like",
				  "love",
				  "hate",
				  "yes"};
		ArrayList<String> outStr = new ArrayList<String>();
		outStr.add("like");
		outStr.add("love");
		outStr.add("hate");
		assertEquals(outStr, LongestWords.longestWords(str));
	}
}
