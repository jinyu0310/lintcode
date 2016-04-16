package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidPalindromeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPalindrome1() {
		assertEquals(false, ValidPalindrome.isPalindrome(null));
	}
	@Test
	public void testIsPalindrome2() {
		assertEquals(true, ValidPalindrome.isPalindrome(""));
	}
	@Test
	public void testIsPalindrome3() {
		assertEquals(false, ValidPalindrome.isPalindrome("abcbac"));
	}
	@Test
	public void testIsPalindrome4() {
		assertEquals(false, ValidPalindrome.isPalindrome("abc*% cda"));
	}
	@Test
	public void testIsPalindrome5() {
		assertEquals(true, ValidPalindrome.isPalindrome("12345asdfgfdsa54321"));
	}
	@Test
	public void testIsPalindrome6() {
		assertEquals(true, ValidPalindrome.isPalindrome("asd11dsa"));
	}
	@Test
	public void testIsPalindrome7() {
//		System.out.println(':'-'1');
		assertEquals(true, ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
	}
	@Test
	public void testIsPalindrome8() {
		assertEquals(true, ValidPalindrome.isPalindrome("A man,nam : a"));
	}
	@Test
	public void testIsPalindrome9() {
		assertEquals(true, ValidPalindrome.isPalindrome("   **%%"));
	}

}
