package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNodeT;
import datastructure.myListt;

public class RemoveLinkedListElementsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRemoveElements() {
		ListNodeT<Integer> head = new ListNodeT<Integer>(3);
		myListt<Integer> myList = new myListt<Integer>(head);
		myList.add(2);myList.add(3);myList.add(3);myList.add(3);
		myList.add(4);myList.add(5);myList.add(3);
		ListNodeT<Integer> p = myList.head;
//		while(p != null){
//			System.out.println(p.val);
//			p = p.next;
//		}
		myListt<Integer> resultList = new myListt<Integer>(2);
		ListNodeT<Integer> resultHead = resultList.head;
		resultList.add(4);resultList.add(5);
		ListNodeT<Integer> removeList = RemoveLinkedListElements.removeElements(head, 3);
		while(resultHead != null && removeList != null){
			System.out.println(resultHead.val);
			System.out.println(removeList.val);
			assertEquals(resultHead.val, removeList.val);
			resultHead = resultHead.next;
			removeList = removeList.next;

		}
	}

}
