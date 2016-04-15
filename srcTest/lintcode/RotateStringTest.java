package lintcode;

import static org.junit.Assert.*;
import hihoCoder.charRemove;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RotateStringTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRotateString0() {
		char[] str = null;
		char[] outstr = null;
		RotateString.rotateString(str, 2);
		assertEquals(outstr, str);	
	}
	@Test
	public void testRotateString1() {
		char[] str = new char[]{'a','b','c','d','e','f','g'};
		char[] outstr = new char[]{'a','b','c','d','e','f','g'};
		RotateString.rotateString(str, 0);
		for(int i = 0; i < str.length;i++){
			assertEquals(outstr[i], str[i]);
		}	
	}
	@Test
	public void testRotateString2() {
		char[] str = new char[]{'a','b','c','d','e','f','g'};
		char[] outstr = new char[]{'g','a','b','c','d','e','f'};
		RotateString.rotateString(str, 1);
		for(int i = 0; i < str.length;i++){
			assertEquals(outstr[i], str[i]);
		}	
	}
	@Test
	public void testRotateString3() {
		char[] str = new char[]{'a','b','c','d','e','f','g'};
		char[] outstr = new char[]{'a','b','c','d','e','f','g'};
		RotateString.rotateString(str, 7);
		for(int i = 0; i < str.length;i++){
			assertEquals(outstr[i], str[i]);
		}	
	}
	@Test
	public void testRotateString4() {
		char[] str = new char[]{'a','b','c','d','e','f','g'};
		char[] outstr = new char[]{'g','a','b','c','d','e','f'};
		RotateString.rotateString(str, 8);
		for(int i = 0; i < str.length;i++){
			assertEquals(outstr[i], str[i]);
		}	
	}
	@Test
	public void testRotateString5() {
		char[] str = new char[0];
		char[] outstr = new char[0];
		RotateString.rotateString(str, 8);
		assertEquals(outstr.length, str.length);
	}
	@Test
	public void testRotateString6() {
		char[] str = new char[]{'a','b','c','d','e','f','g'};
		char[] outstr = new char[]{'f','g','a','b','c','d','e'};
		RotateString.rotateString(str, 9);
		for(int i = 0; i < str.length;i++){
			assertEquals(outstr[i], str[i]);
		}	
	}

}
