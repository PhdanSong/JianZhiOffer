/*
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第一个节点。
 * eg:链表是{1,2,3,4}倒数第三个节点的值就是2
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
