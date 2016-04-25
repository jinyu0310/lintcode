package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class IntersectionOfTwoLinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetIntersectionNode1() {
		myList myL = new myList(1);
		myL.add(2);myL.add(3);
		myL.add(4);myL.add(5);
		myL.add(6);myL.add(7);
		myList myr = new myList(5);
		myr.add(6);myr.add(7);
		myList re = new myList(5);
		re.add(6);re.add(7);re.add(3);
		ListNode reHead = re.head;
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(myL.head,myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testGetIntersectionNode2() {
		myList myL = new myList(1);
		myL.add(2);myL.add(3);
		myL.add(4);myL.add(5);
		myL.add(6);myL.add(7);
		myList myr = new myList(3);
		myr.add(4);myr.add(7);
		myList re = new myList(7);
		re.add(1);
		ListNode reHead = re.head;
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(myL.head,myr.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;
		}
	}
	@Test
	public void testGetIntersectionNode3() {
		myList myL = new myList(1);
		myL.add(2);myL.add(3);
		myList myr = new myList(1);
		myr.add(2);myr.add(3);
		myList re = new myList(1);
		re.add(2);re.add(3);
		ListNode reHead = re.head;
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(myL.head,myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	@Test
	public void testGetIntersectionNode4() {
		myList myL = new myList(1);
		myL.add(2);myL.add(3);
		myL.add(4);myL.add(5);
		myL.add(6);myL.add(7);
		myList myr = new myList(5);
		myr.add(6);myr.add(7);
		myList re = new myList(5);
		re.add(1);re.add(4);re.add(3);re.add(6);
		re.add(5);re.add(7);
		ListNode reHead = re.head;
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(null,myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

	@Test
	public void testGetIntersectionNode5() {
		myList myL = new myList(1);
		myL.add(2);myL.add(3);
		myL.add(4);myL.add(5);
		myL.add(6);myL.add(7);
		myList myr = new myList(4);
		myr.add(3);myr.add(2);
		myList re = new myList(5);
		re.add(1);re.add(4);re.add(3);re.add(6);
		re.add(5);re.add(7);
		ListNode reHead = re.head;
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(myL.head,myr.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
	@Test
	public void testGetIntersectionNode6() {
		myList myL = new myList(1);
		myL.add(3);myL.add(5);
		myL.add(7);myL.add(9);
		myL.add(11);myL.add(12);
		myList myr = new myList(2);
		myr.add(4);myr.add(6);
		myr.add(8);myr.add(10);
		myr.add(12);
		myList re = new myList(12);
		re.add(1);re.add(4);re.add(3);re.add(6);
		re.add(5);re.add(7);
		ListNode reHead = re.head;
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(myL.head,myr.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}
	
}
