package lintcode;

import datastructure.ListNode;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public static ListNode insertionSortList(ListNode head) {
    	if(head == null){
    		return head;
    	}
    	ListNode find = head; //��ѭ������ָ�� find.nextλ������ڵ�
    	while(find.next != null){
    		ListNode point = new ListNode(-1); //��ѭ��Ѱ�Ҳ���λ��ָ��
    		point.next = head;  //point.nextΪ��ֹλ��
    		//������Ԫ����С������ͷָ��λ��
    		if(head.val > find.next.val){
        		ListNode p = find.next; //ȡ��������ڵ�
        		find.next = find.next.next; //������λ�ô�����
        		p.next = point.next; //���봦����
        		head = p; //�޸�ͷָ��ָ�� 
    		}else{
    			//�ж��Ƿ�������
    			if(find.val <= find.next.val){
    				find = find.next; //�������У����ö���findָ�����һλ
    			}else{
    				//�ҵ���ȷ�Ĳ���λ��
            		while(point.next.val <= find.next.val){ //С�ڣ����ȶ���С�ڵ���Ӧ�����ȶ���
            			point = point.next;
            		}
            		ListNode p = find.next; //ȡ��������ڵ�
            		find.next = find.next.next; //������λ�ô�����
            		p.next = point.next; //���봦����
            		point.next = p; 
    			}
    		}
    	}
		return head;
        // write your code here
    }

}
