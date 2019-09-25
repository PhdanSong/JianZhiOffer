import java.util.Arrays;

/*
 * ��Ŀ������n���������ҳ�������С��k����
 * eg:����4,5,1,6,2,7,3,8�����С��4����1,2,3,4
 * */
public class Problem30 {
	public static void main(String[] args) {
		Problem30 test=new Problem30();
		int[] array= {4,5,1,6,2,7,3,8};
		test.getLeastNumbers(array,2);
	}

	public void getLeastNumbers(int[] array, int k) {
		if(array==null||k<0||k>array.length)
			return;
		int[] kArray=Arrays.copyOfRange(array, 0, k);
		buildMaxHeap(kArray);
		for(int i=0;i<array.length;i++) {
			if(array[i]<kArray[0]) {
				kArray[0]=array[i];
				maxHeap(kArray,0);
			}
		}
		for(int i:kArray) {
			System.out.println(i);
		}
	}

	private void buildMaxHeap(int[] kArray) {
		for(int i=kArray.length/2;i>=0;i--)
			maxHeap(kArray, i);
	}

	private void maxHeap(int[] kArray, int i) {
		int left=2*i;
		int right=left+1;
		int largest=0;
		if(right<kArray.length&&kArray[left]>kArray[i])
			largest=left;
		else
			largest=i;
		if(right<kArray.length&&kArray[right]>kArray[largest])
			largest=right;
		if(largest!=i) {
			int temp=kArray[i];
			kArray[i]=kArray[largest];
			kArray[largest]=temp;
			maxHeap(kArray, largest);
		}
	}
}
