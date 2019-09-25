/*
 * 输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得所有奇数位在数组的
 * 前半部分，偶数位在数组的后半部分
 * */
public class Problem14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		Problem14 test = new Problem14();
		test.order(array);
		for (int item : array)
			System.out.println(item);
	}

	public void order(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			while (start < end && !isEven(array[start])) {
				start++;
			}
			while (start < end && isEven(array[end])) {
				end--;
			}
			if (start < end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
			}
		}
	}

	private boolean isEven(int n) {

		return n % 2 == 0;
	}
}
