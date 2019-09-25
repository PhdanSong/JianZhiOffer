/*
 * 题目：我们把只包含2 3 5 的称之为丑数，求按从小到大的1500个丑数，1作为第一个丑数
 * */
public class Problem34 {
	public static void main(String[] args) {
		Problem34 p = new Problem34();
		System.out.println(p.getUglyNumber(1500));
	}

	public int getUglyNumber(int n) {
		if (n < 0)
			return 0;
		int[] uglyArray = new int[n];
		uglyArray[0] = 1;
		int multiply2 = 1;
		int multiply3 = 1;
		int multipliy5 = 1;
		for (int i = 1; i < uglyArray.length; i++) {
			int min = min(multiply2 * 2, multiply3 * 3, multipliy5 * 5);
			uglyArray[i] = min;
			while (multiply2 * 2 <= min)
				multiply2++;
			while (multiply3 * 3 <= min)
				multiply3++;
			while (multipliy5 * 5 <= min)
				multipliy5++;
		}
		return uglyArray[n - 1];
	}

	private int min(int i, int j, int k) {
		int min = (i < j) ? i : j;
		return (min < k) ? min : k;
	}
}
