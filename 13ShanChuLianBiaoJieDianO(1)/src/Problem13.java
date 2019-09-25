/*
 *�������������ͷָ���һ�����ָ�룬����һ��������o(1)ʱ��ɾ���ýڵ� 
*/
public class Problem13 {
	public static void main(String[] args) {
		ListNode head = new ListNode();
		ListNode second = new ListNode();
		ListNode third = new ListNode();
		head.nextNode = second;
		second.nextNode = third;
		head.data = 1;
		second.data = 2;
		third.data = 3;
		Problem13 p13 = new Problem13();
		p13.deleteNode(head, second);
		System.out.println(head.nextNode.data);
	}

	public void deleteNode(ListNode head, ListNode deListNode) {
		if (deListNode == null || head == null) {
			return;
		}
		if (head == deListNode) {
			// ɾ��ͷ�ڵ�
			head = null;
		} else {
			if (deListNode.nextNode == null) {
				// ɾ��β�ڵ�
				ListNode pointListNode = head;
				while (pointListNode.nextNode.nextNode != null) {
					pointListNode = pointListNode.nextNode;
				}
				pointListNode.nextNode = null;
			} else {
				deListNode.data = deListNode.nextNode.data;
				deListNode.nextNode = deListNode.nextNode.nextNode;
			}
		}
	}
}
