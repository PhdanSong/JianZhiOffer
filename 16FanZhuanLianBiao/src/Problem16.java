/*
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 * */
public class Problem16 {

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
		Problem16 test = new Problem16();
		ListNode resultListNode = test.reverseList(head);
		System.out.println(resultListNode.data);
	}

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}
		if (head.nextNode == null) {
			return head;
		}
		ListNode preListNode = null;
		ListNode nowListNode = head;
		ListNode reversedHead = null;
		while (nowListNode.nextNode != null) {
			ListNode nextListNode = nowListNode.nextNode;
			if (nextListNode == null)
				reversedHead = nextListNode;
			nowListNode.nextNode = preListNode;
			preListNode = nowListNode;
			nowListNode = nextListNode;
		}
		return nowListNode;
	}
}
