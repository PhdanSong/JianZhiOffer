/*
 * ��Ŀ������һ������n,��1--n��n��������ʮ���Ʊ�ʾ��1���ֵĴ���
 * eg:12->1 10 11 12 һ��������5��
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
			current = (n / i) % 10;// ��ǰλ
			before = n / (i * 10);// ��λ����
			after = n - (n / i) * i;// ��λ����
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
