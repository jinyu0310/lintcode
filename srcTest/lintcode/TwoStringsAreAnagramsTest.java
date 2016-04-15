package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoStringsAreAnagramsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAnagram1() {
		assertEquals(false, TwoStringsAreAnagrams.anagram(null, null));
	}
	@Test
	public void testAnagram2() {
		assertEquals(false, TwoStringsAreAnagrams.anagram(null, "a"));
	}
	@Test
	public void testAnagram3() {
		assertEquals(true, TwoStringsAreAnagrams.anagram("", ""));
	}
	@Test
	public void testAnagram4() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("", "a"));
	}
	@Test
	public void testAnagram5() {
		assertEquals(true, TwoStringsAreAnagrams.anagram("a", "a"));
	}
	@Test
	public void testAnagram6() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("a", "b"));
	}
	@Test
	public void testAnagram7() {
		assertEquals(true, TwoStringsAreAnagrams.anagram("ab", "ba"));
	}
	@Test
	public void testAnagram8() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("ab", "aa"));
	}
	@Test
	public void testAnagram9() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("abc", "ab"));
	}
	@Test
	public void testAnagram10() {
		assertEquals(true, TwoStringsAreAnagrams.anagram("abc", "cba"));
	}
	@Test
	public void testAnagram11() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("abc", "cbc"));
	}
	@Test
	public void testAnagram12() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("abcab", "abcad"));
	}
	@Test
	public void testAnagram13() {
		assertEquals(false, TwoStringsAreAnagrams.anagram("abcab", "aaacb"));
	}
}
