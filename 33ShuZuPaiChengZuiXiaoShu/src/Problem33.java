/*
 * function:Arrange the array into the smallest number
 * author:Dan
 * Date:2019-9-19
 * */
public class Problem33 {
	public static void main(String[] args) {
		Problem33 test = new Problem33();
		int[] array = { 3, 32, 321 };
		test.printMin(array);
	}

	private void printMin(int[] array) {
		int[] clone = array.clone();
		printMinNumber(clone, 0, clone.length - 1);
		for (int i : clone)
			System.out.print(i);
	}

	private void printMinNumber(int[] array, int start, int end) {
		if (start < end) {
			int main_number = array[end];
			int small_cur = start;
			for (int j = start; j < end; j++) {
				if (isSmall(String.valueOf(array[j]), String.valueOf(main_number))) {
					int temp = array[j];
					array[j] = array[small_cur];
					array[small_cur] = temp;
					small_cur++;
				}
			}
			array[end] = array[small_cur];
			array[small_cur] = main_number;
			printMinNumber(array, 0, small_cur - 1);
			printMinNumber(array, small_cur + 1, end);
		}
	}

	private boolean isSmall(String m, String n) {
		String left = m + n;
		String right = n + m;
		boolean result = false;
		for (int i = 0; i < left.length(); i++) {
			if (left.charAt(i) < right.charAt(i))
				return true;
			else if (left.charAt(i) > right.charAt(i))
				return false;
		}
		return result;
	}
}
