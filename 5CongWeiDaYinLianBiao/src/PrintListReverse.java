import java.util.Stack;
/*
 * ����һ�������ͷ�ڵ㣬��β��ͷ��������ӡ��ÿ���ڵ��ֵ
 * 
 * */
//�ǵݹ�
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
		System.out.println("�ݹ����");
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

	//�ǵݹ�
	public static void printListReverse(ListNode headNode) {
		Stack<ListNode> stack=new Stack<ListNode>();
		while(headNode!=null) {
			stack.push(headNode);
			headNode=headNode.next;
		}
		System.out.println("�ǵݹ鷽ʽ");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().data);
		}
	}
	
	//�ݹ鷽ʽ
	
}
