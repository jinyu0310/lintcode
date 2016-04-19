package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class PartitionListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPartition() {
		myList myL = new myList(1);
		myL.add(6);myL.add(2);myL.add(7);
		int partvalue = 3;
		myList out = new myList(1);
		out.add(2);out.add(6);out.add(7);
		ListNode reHead = out.head;
		ListNode res = PartitionList.partition(myL.head, partvalue);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;
		}
	}

}
