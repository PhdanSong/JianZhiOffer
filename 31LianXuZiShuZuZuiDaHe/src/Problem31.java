/*
 * 输入一个数组，数组中有正有负，数组中一个或多个连续的多个整数组成一个子数组，求所有子数组的最大和，要求时间复杂度是o(n)
 * eg:{1,-2,3,10,-4,7,2,-5}==>{3,10,-4,7,2}
 * */
public class Problem31 {

	public static void main(String[] args) {
		Problem31 p = new Problem31();
		int[] array = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(p.findGreatestSunArray(array));
	}

	public int findGreatestSunArray(int[] array) {
		if (array == null)
			return 0;
		int currentSum = 0;
		int greatestSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (currentSum <= 0) {
				currentSum = array[i];
			} else {
				currentSum += array[i];
			}
			if (currentSum > greatestSum)
				greatestSum = currentSum;
		}
		return greatestSum;
	}

}
