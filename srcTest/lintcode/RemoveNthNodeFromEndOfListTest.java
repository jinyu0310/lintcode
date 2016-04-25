package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class RemoveNthNodeFromEndOfListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRemoveNthFromEnd1() {
		myList myL = new myList(1);
		myL.add(2);myL.add(2);
		myL.add(2);myL.add(3);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(2);
		re.add(2);re.add(2);re.add(3);
		ListNode reHead = re.head;
		ListNode res = RemoveNthNodeFromEndOfList.removeNthFromEnd(myL.head,5);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testRemoveNthFromEnd2() {
		myList myL = new myList(1);
		myL.add(1);myL.add(2);
		myL.add(2);myL.add(3);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(1);
		re.add(2);re.add(3);
		ListNode reHead = re.head;
		ListNode res = RemoveNthNodeFromEndOfList.removeNthFromEnd(null,1);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testRemoveNthFromEnd3() {
		myList myL = new myList(1);
		myL.add(1);myL.add(2);
		myL.add(2);myL.add(3);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(1);
		re.add(2);re.add(3);
		ListNode reHead = re.head;
		ListNode res = RemoveNthNodeFromEndOfList.removeNthFromEnd(myL.head,-1);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testRemoveNthFromEnd4() {
		myList myL = new myList(1);
		myL.add(1);myL.add(2);
		myL.add(2);myL.add(3);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(1);
		re.add(2);re.add(3);
		ListNode reHead = re.head;
		ListNode res = RemoveNthNodeFromEndOfList.removeNthFromEnd(myL.head,10);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testRemoveNthFromEnd5() {
		myList myL = new myList(1);
		myL.add(1);myL.add(1);
		myL.add(2);myL.add(3);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(1);
		re.add(1);re.add(1);re.add(3);
		ListNode reHead = re.head;
		ListNode res = RemoveNthNodeFromEndOfList.removeNthFromEnd(myL.head,2);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

}
