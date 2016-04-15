package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SpaceRepalcementTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReplaceBlank1() {
		char[] str = new char[]{};
		assertEquals(0, SpaceRepalcement.replaceBlank(str, 0));
	}
	@Test
	public void testReplaceBlank2() {
		char[] str = new char[100];
		str[0] = ' ';str[1] = ' ';str[2] = 'a';
		str[3] = ' ';str[4] = ' ';str[5] = 'b';
		str[6] = 'c';str[7] = ' ';str[8] = ' ';
		assertEquals(21, SpaceRepalcement.replaceBlank(str, 9));
	}
	@Test
	public void testReplaceBlank3() {
		char[] str = null;
		assertEquals(0, SpaceRepalcement.replaceBlank(str, 5));
	}
//	@Test
//	public void testReplaceBlank4() {
//		char[] str = new char[]{};
//		assertEquals(0, SpaceRepalcement.replaceBlank(str, 0));
//	}

}
