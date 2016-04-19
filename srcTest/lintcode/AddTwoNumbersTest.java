package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class AddTwoNumbersTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddListsNoC() {
		myList myL = new myList(7);
		myL.add(1);myL.add(6);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(2);
		re.add(1);re.add(9);
		ListNode reHead = re.head;
		ListNode res = AddTwoNumbers.addLists(myL.head, myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

	@Test
	public void testAddListsC() {
		myList myL = new myList(7);
		myL.add(1);myL.add(6);
		myList myr = new myList(2);
		myr.add(9);myr.add(5);
		myList re = new myList(9);
		re.add(0);re.add(2);re.add(1);
		ListNode reHead = re.head;
		ListNode res = AddTwoNumbers.addLists(myL.head, myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	//我的测试代码本身写的就不对！！
	@Test
	public void testAddListsNoC2() {
		myList myL = new myList(3);
		myL.add(1);myL.add(5);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(8);
		re.add(0);re.add(8);
		ListNode reHead = re.head;
		ListNode res = AddTwoNumbers.addLists(myL.head, myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testAddListsNoEqLen() {
		myList myL = new myList(3);
		myL.add(1);myL.add(2);
		myList myr = new myList(5);
		myr.add(9);myr.add(5);myr.add(1);
		myList re = new myList(8);
		re.add(0);re.add(8);re.add(1);
		ListNode reHead = re.head;
		ListNode res = AddTwoNumbers.addLists(myL.head, myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
}
