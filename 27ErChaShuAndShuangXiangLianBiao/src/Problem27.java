//只有函数，没有执行

/*
 * 题目：输入一颗二叉排序树，转换成一个排序的双向链表，
 * 要求不能创建新结点，只能调整树中结点指向
 * */
public class Problem27 {
	public BinaryTreeNode convert(BinaryTreeNode root) {
		BinaryTreeNode lastNodeList = null;
		convertNode(root, lastNodeList);
		while (lastNodeList != null && lastNodeList.leftNode != null) {
			lastNodeList = lastNodeList.leftNode;
		}
		return lastNodeList;
	}

	private void convertNode(BinaryTreeNode root, BinaryTreeNode lastNodeList) {
		if (root == null)
			return;
		BinaryTreeNode current = root;
		if (current.leftNode != null) {
			convertNode(current.leftNode, lastNodeList);
		}
		current.leftNode = lastNodeList;
		if (lastNodeList != null)
			lastNodeList.rightNode = current;
		lastNodeList = current;
		if (current.rightNode != null) {
			convertNode(current.rightNode, lastNodeList);
		}

	}
}
