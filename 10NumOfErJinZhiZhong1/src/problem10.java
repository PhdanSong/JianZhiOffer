/*
 * ����һ����������������������Ʊ�ʾ��1�ĸ���
 * */
public class problem10 {

	public static void main(String[] args) {
		problem10 test = new problem10();
		System.out.println(test.numberOf1(3));
	}

	public int numberOf1(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=(n-1)&n;
		}
		return count;
	}
}
