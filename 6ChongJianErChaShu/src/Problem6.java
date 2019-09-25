//error
import java.util.Arrays;

/*
 * 输入二叉树的前序遍历和中序遍历的结果，重建该二叉树
 * */
public class Problem6 {
public static void main(String[] args) throws Exception {
	int[] preSort= {1,2,4,7,3,5,6,8};
	int[] inSort = {4,7,2,1,5,3,8,6};
	BinaryTreeNode root=constructCore(preSort,inSort);
}	

public static BinaryTreeNode constructCore(int[] preOrder, int[] inOrder) throws Exception {
	if(preOrder==null||inOrder==null) {
		return null;
	}
	System.out.println("preOrder.length:"+preOrder.length);
	System.out.println("inOrder.length:"+inOrder.length);
	if(preOrder.length!=inOrder.length) {
		throw new Exception("长度不一样，非法输入");
	}
	BinaryTreeNode root = new BinaryTreeNode();
	for(int i=0;i<inOrder.length;i++) {
		if(inOrder[i]==preOrder[0]) {
			root.value=inOrder[i];
			System.out.println(root.value);
			root.leftNode=constructCore(Arrays.copyOfRange(preOrder, 1, i+1),Arrays.copyOfRange(inOrder, 0, i));
			root.rightNode=constructCore(Arrays.copyOfRange(preOrder, i+1, preOrder.length), Arrays.copyOfRange(inOrder, i, inOrder.length));
		}
	}
	return root;
}
}
