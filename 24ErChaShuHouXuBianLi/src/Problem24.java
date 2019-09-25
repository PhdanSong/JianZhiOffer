import java.util.Arrays;

/*
 * 题目：输入一个整数数组，判断该数组是否是某二叉搜索树的后序遍历结果
 * */
public class Problem24 {

	public static void main(String[] args) {
		int[] array = { 5, 6, 7, 9, 11, 10, 8 };
		Problem24 p24 = new Problem24();
		System.out.println(p24.verifySequenceOfBST(array));
	}

	public boolean verifySequenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length == 0)
			return false;
		int length = sequence.length;
		int root = sequence[length - 1];
		int cut = 0;
		for (int i = 0; i < length - 1; i++) {
			if (sequence[i] > root)
				cut = i + 1;
			break;
		}
		if (cut == 0) {
			verifySequenceOfBST(Arrays.copyOfRange(sequence, 0, length - 1));
		} else {
			for (int j = cut; j < length - 1; j++) {
				if (sequence[j] < root)
					return false;
			}
		}
		boolean left = true;
		if (cut > 0)
			left = verifySequenceOfBST(Arrays.copyOfRange(sequence, 0, cut));
		boolean right = true;
		if (cut < length - 1)
			right = verifySequenceOfBST(Arrays.copyOfRange(sequence, cut, length - 1));
		return (right && left);
	}
}
