import java.util.Stack;

/*
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ��min����
 * ��ջ�У�����min push pop��ʱ�临�Ӷȶ���o(1)
 * */
public class Problem21 {
public static void main(String[] args) {
	Problem21 test = new Problem21();
	test.push(3);
	test.push(2);
	test.push(1);
	test.push(4);
	test.push(5);
	System.out.println(test.min());
	
}
private MyStack<Integer> minStack=new MyStack<Integer>();
private MyStack<Integer> dataStack=new MyStack<Integer>();

public  void push(Integer item) {
	dataStack.push(item);
	if(minStack.length==0||item<=minStack.head.data) {
		minStack.push(item);
	}else {
		minStack.push(minStack.head.data);
	}
}
}
