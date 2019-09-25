/*
 * 题目：实现复制一个复杂链表。在复杂链表中，每个结点除了有一个next指针指向下一个结点之外，还有一个指向链表中任意结或null
 * */
public class Problem26 {
	public static void main(String[] args) {
		Problem26 testClone = new Problem26();
		ComplexListNode root = new ComplexListNode();
		ComplexListNode node1 = new ComplexListNode();
		ComplexListNode node2 = new ComplexListNode();
		ComplexListNode node3 = new ComplexListNode();
		ComplexListNode node4 = new ComplexListNode();
		root.data = 1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		root.data = 1;
		node1.data = 2;
		node2.data = 3;
		node3.data = 4;
		node4.data = 5;
		root.sibling = node1;
		node1.sibling = root;
		node3.sibling = node1;
		ComplexListNode result = testClone.clone(root);
		System.out.println(result.data);
	}

	public ComplexListNode clone(ComplexListNode head) {
		cloneNodes(head);
		connectSiblingNodes(head);
		return reconnectNodes(head);
	}

	public ComplexListNode reconnectNodes(ComplexListNode head) {
		ComplexListNode node = head;
		ComplexListNode cloneHead = null;
		ComplexListNode cloneNode = null;
		if (node != null) {
			cloneNode = node.next;
			cloneHead = cloneNode;
			node.next = cloneNode.next;
			node = node.next;
		}
		while (node != null) {
			cloneNode.next = node.next;
			cloneNode = cloneHead.next;
			node.next = cloneNode.next;
			node = node.next;
		}
		return cloneHead;
	}

	public void connectSiblingNodes(ComplexListNode head) {
		ComplexListNode node = head;
		while (node != null) {
			ComplexListNode clonedNode = node.next;
			if (node.sibling != null) {
				clonedNode.sibling = node.sibling.next;
			}
			node = clonedNode.next;
		}

	}

	public void cloneNodes(ComplexListNode head) {
		ComplexListNode node = head;
		while (node != null) {
			ComplexListNode cloneNode = new ComplexListNode();
			cloneNode.data = node.data;
			cloneNode.next = node.next;
			cloneNode.sibling = null;
			node.next = cloneNode;
			node = cloneNode.next;
		}

	}
}
