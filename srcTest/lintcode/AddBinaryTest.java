package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddBinaryTest {
	
	//AddBinary adb = new AddBinary();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddBinary1() {
		assertEquals("100", AddBinary.addBinary("11", "1"));
	}
	@Test
	public void testAddBinary2() {
		assertEquals("11", AddBinary.addBinary("11", "0"));
	}
	@Test
	public void testAddBinary3() {
		assertEquals("11", AddBinary.addBinary("10", "1"));
	}
	@Test
	public void testAddBinary4() {
		assertEquals("111100", AddBinary.addBinary("110001", "1011"));
	}
	@Test
	public void testAddBinary5() {
		assertEquals("11010", AddBinary.addBinary("1111", "1011"));
	}

}
