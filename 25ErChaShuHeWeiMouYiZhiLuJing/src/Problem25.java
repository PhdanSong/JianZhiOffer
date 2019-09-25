import java.util.Stack;

/*
 * ��Ŀ������һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�δ��������������·��
 * �����ĸ��ڵ㿪ʼһֱ���µ�Ҷ�ڵ��������Ľ���γ�һ��·��
 * */
public class Problem25 {
	public static void main(String[] args) {
		BinaryTreeNode root1 = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		root1.leftNode = node1;
		root1.rightNode = node2;
		node1.leftNode = node3;
		node1.rightNode = node4;
		root1.value = 10;
		node1.value = 5;
		node2.value = 12;
		node3.value = 4;
		node4.value = 7;
		Problem25 testFindPath = new Problem25();
		testFindPath.findPath(root1, 22);
	}

	public void findPath(BinaryTreeNode root, int sum) {
		if (root == null)
			return;
		Stack<Integer> stack = new Stack<Integer>();
		int currentSum = 0;
		findPath(root, sum, stack, currentSum);

	}

	private void findPath(BinaryTreeNode root, int sum, Stack<Integer> stack, int currentSum) {
		currentSum += root.value;
		stack.push(root.value);
		if (root.leftNode == null && root.rightNode == null) {
			if (currentSum == sum) {
				System.out.println("�ҵ�һ��·��");
				for (int path : stack) {
					System.out.println(path + " ");
				}
				System.out.println();
			}
		}
		if (root.leftNode != null) {
			findPath(root.leftNode, sum, stack, currentSum);
		}
		if (root.rightNode != null) {
			findPath(root.rightNode, sum, stack, currentSum);
		}
		stack.pop();

	}
}
