/*
 * ����һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β�ڵ��ǵ�����һ���ڵ㡣
 * eg:������{1,2,3,4}�����������ڵ��ֵ����2
 * 
 * */
public class Problem15 {
	public static void main(String[] args) {
		ListNode head = new ListNode();
		ListNode second = new ListNode();
		ListNode third = new ListNode();
		ListNode forth = new ListNode();
		head.nextNode = second;
		second.nextNode = third;
		third.nextNode = forth;
		head.data = 1;
		second.data = 2;
		third.data = 3;
		forth.data = 4;
		Problem15 test = new Problem15();
		ListNode resultListNode = test.findKToTail(head, 3);
		System.out.println(resultListNode.data);
	}

	public ListNode findKToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		ListNode resultNode = null;
		ListNode headListNode = head;
		for (int i = 0; i < k; i++) {
			if (headListNode.nextNode != null) {
				headListNode = headListNode.nextNode;
			} else {
				return null;
			}
		}
		resultNode = head;
		while (headListNode != null) {
			resultNode = resultNode.nextNode;
			headListNode = headListNode.nextNode;
		}
		return resultNode;
	}
}
