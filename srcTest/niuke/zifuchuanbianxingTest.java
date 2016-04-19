package niuke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class zifuchuanbianxingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTrans1() {
		String s = " This is a sample";
		String outStrin = zifuchuanbianxing.trans3(s, 17);
		System.out.println(outStrin);
		assertEquals("SAMPLE A IS tHIS ", outStrin);
	}
	@Test
	public void testTrans2() {
		String s = "This is a sample";
		String outStrin = zifuchuanbianxing.trans3(s, 16);
		System.out.println(outStrin);
		assertEquals("SAMPLE A IS tHIS", outStrin);
	}
	@Test
	public void testTrans3() {
		String s = " This is a sample ";
		String outStrin = zifuchuanbianxing.trans3(s, 18);
		System.out.println(outStrin);
		assertEquals(" SAMPLE A IS tHIS ", outStrin);
	}
	@Test
	public void testTrans4() {
		String s = "  This is a  sample Adsasdasdas  ";
		String outStrin = zifuchuanbianxing.trans3(s, 33);
		System.out.println(outStrin);
		assertEquals("  aDSASDASDAS SAMPLE  A IS tHIS  ", outStrin);
	}
	@Test
	public void testTrans5() {
		String s = "This";
		String outStrin = zifuchuanbianxing.trans3(s, 4);
		System.out.println(outStrin);
		assertEquals("tHIS", outStrin);
	}
}
