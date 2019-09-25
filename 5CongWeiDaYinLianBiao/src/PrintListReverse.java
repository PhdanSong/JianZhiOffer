import java.util.Stack;
/*
 * 输入一个链表的头节点，从尾到头反过来打印出每个节点的值
 * 
 * */
//非递归
public class PrintListReverse {

	public static void main(String[] args) {
		ListNode node1 = new ListNode();
		ListNode node2= new ListNode();
		ListNode node3=new ListNode();
		node1.data=1;
		node2.data=2;
		node3.data=3;
		node1.next =node2;
		node2.next=node3;
		PrintListReverse test=new PrintListReverse();
		test.printListReverse(node1);
		System.out.println("递归遍历");
		test.printListReverse2(node1);
	}

	public static void printListReverse2(ListNode headNode) {
		if(headNode!=null) {
			if(headNode.next!=null) {
				printListReverse2(headNode.next);
			}
		}
		System.out.println(headNode.data);
	}

	//非递归
	public static void printListReverse(ListNode headNode) {
		Stack<ListNode> stack=new Stack<ListNode>();
		while(headNode!=null) {
			stack.push(headNode);
			headNode=headNode.next;
		}
		System.out.println("非递归方式");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().data);
		}
	}
	
	//递归方式
	
}
