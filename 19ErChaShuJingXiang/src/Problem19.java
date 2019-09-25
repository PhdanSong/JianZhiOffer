import java.util.Stack;

/*
 * 完成一个函数：输入一个二叉树，该函数输出其镜像
 * */
public class Problem19 {
	public static void main(String[] args) {
		BinaryTreeNode root1 = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		root1.leftNode = node1;
		root1.rightNode = node2;
		node1.leftNode = node3;
		node1.rightNode = node4;
		node4.leftNode = node5;
		node4.rightNode = node6;
		root1.value = 8;
		node1.value = 8;
		node2.value = 7;
		node3.value = 9;
		node4.value = 2;
		node5.value = 4;
		node6.value = 7;

		Problem19 test = new Problem19();
		BinaryTreeNode rootBinaryTreeNode = test.mirrorBinaryTree(root1);
		System.out.println(root1.rightNode.value);
	}

	public BinaryTreeNode mirrorBinaryTree(BinaryTreeNode root) {
		if (root == null) {
			return null;
		}
		if (root.leftNode == null && root.rightNode == null) {
			return null;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				BinaryTreeNode temp = root.leftNode;
				root.leftNode = root.rightNode;
				root.rightNode = temp;
				stack.push(root);
				root = root.leftNode;
			}
			root = stack.pop();
			root = root.rightNode;
		}
		return root;
	}
}
