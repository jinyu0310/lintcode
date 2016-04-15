package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharactersTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsUnique1() {
		assertEquals(false, UniqueCharacters.isUnique(null));
	}
	@Test
	public void testIsUnique2() {
		assertEquals(false, UniqueCharacters.isUnique(""));
	}
	@Test
	public void testIsUnique3() {
		assertEquals(true, UniqueCharacters.isUnique("ab"));
	}
	@Test
	public void testIsUnique4() {
		assertEquals(false, UniqueCharacters.isUnique("aa"));
	}

}
