//ֻ�к�����û��ִ��

/*
 * ��Ŀ������һ�Ŷ�����������ת����һ�������˫������
 * Ҫ���ܴ����½�㣬ֻ�ܵ������н��ָ��
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
