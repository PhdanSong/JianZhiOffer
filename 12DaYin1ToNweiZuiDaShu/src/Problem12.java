/*
 * 输入数字n,按顺序打印从1到最大的n位进制数，比如输入3，则打印出1 2 3 直到999
 * */
public class Problem12 {
	public static void main(String[] args) {
		Problem12 p12 = new Problem12();
		p12.printToMaxOfNDigits(2);
	}

	public void printToMaxOfNDigits(int n) {
		int[] array = new int[n];
		if (n <= 0)
			return;
		printArray(array, 0);

	}

	private void printArray(int[] array, int n) {
		for (int i = 0; i < 10; i++) {
			if (n != array.length) {
				array[n] = i;
				printArray(array, n + 1);
			} else {
				boolean isFirstNo0 = false;
				for (int j = 0; j < array.length; j++) {
					if (array[j] != 0) {
						System.out.println(array[j]);
						if (!isFirstNo0)
							isFirstNo0 = true;
					} else {
						if (isFirstNo0)
							System.out.println(array[j]);
					}
				}
				System.out.println();
				return;
			}
		}

	}
}
