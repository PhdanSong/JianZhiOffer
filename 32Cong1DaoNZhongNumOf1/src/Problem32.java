/*
 * 题目：输入一个整数n,求1--n这n个整数的十进制表示中1出现的次数
 * eg:12->1 10 11 12 一共出现了5次
 * */
public class Problem32 {
	public static void main(String[] args) {
		Problem32 p = new Problem32();
		System.out.println(p.countOne(12));
	}

	public long countOne(long n) {
		long count = 0;
		long i = 1;
		long current = 0, after = 0, before = 0;
		while ((n / i) != 0) {
			current = (n / i) % 10;// 当前位
			before = n / (i * 10);// 高位数字
			after = n - (n / i) * i;// 低位数字
			if (current > 1)
				count = count + (before + 1) * i;
			else if (current == 0)
				count = count + before * i;
			else if (current == 1)
				count = count + before * i + after + 1;
			i = i * 10;
		}
		return count;
	}
}
