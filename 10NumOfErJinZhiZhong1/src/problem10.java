/*
 * 输入一个整数，输出该整数二进制表示中1的个数
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
