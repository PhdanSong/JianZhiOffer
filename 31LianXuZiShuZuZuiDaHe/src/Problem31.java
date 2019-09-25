/*
 * ����һ�����飬�����������и���������һ�����������Ķ���������һ�������飬����������������ͣ�Ҫ��ʱ�临�Ӷ���o(n)
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
