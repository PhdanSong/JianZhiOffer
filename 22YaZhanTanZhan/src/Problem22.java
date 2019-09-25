import java.util.Stack;
/*
 * 题目：输入两个整数序列，第一个序列是栈的压入序列，请判断第二个序列是否是该栈的弹出序列
 * */
public class Problem22 {
public static void main(String[] args) {
	int[] array1= {1,2,3,4,5};
	int[] array2= {4,3,5,2,1};
	Problem22 test=new Problem22();
	System.out.println(test.isPopOrder(array1,array2));
}

private boolean isPopOrder(int[] line1, int[] line2) {
	if(line1==null||line2==null) {
		return false;
	}
	int point1=0;
	Stack<Integer> stack=new Stack<Integer>();
	for(int i=0;i<line2.length;i++) {
		if(!stack.isEmpty()&&stack.peek()==line2[i]) {
			stack.pop();
		}else {
			if(point1==line1.length) {
				return false;
			}else {
				do {
					stack.push(line1[point1++]);
				}while(stack.peek()!=line2[i]&&point1!=line1.length);
				if(stack.peek()==line2[i])
					stack.pop();
				else
					return false;
			}
		}
	}
	return true;
}
}
