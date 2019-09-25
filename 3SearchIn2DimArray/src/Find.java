/*
 * 问题描述：一个二维数组，每一行从左到右递增，每一列从上到下递增，输入一个二维数组和一个整数，判断数组中是否含有整数
 * 
 * */
public class Find {

	public static boolean find(int[][] array, int number) {
		if (array == null) {
			return false;
		}
		int column = array[0].length - 1;
		int row = 0;
		while (row < array.length && column >= 0) {
			if (array[row][column] == number) {
				return true;
			}
			if (array[row][column] > number) {
				column--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [][] testArray=new int [4][4];
		testArray[0][0]=1;
		testArray[0][1]=2;
		testArray[0][2]=8;
		testArray[0][3]=9;
	
		testArray[1][0]=2;
		testArray[1][1]=4;
		testArray[1][2]=9;
		testArray[1][3]=12;
		
		testArray[2][0]=4;
		testArray[2][1]=7;
		testArray[2][2]=10;
		testArray[2][3]=13;
		
		testArray[3][0]=6;
		testArray[3][1]=8;
		testArray[3][2]=11;
		testArray[3][3]=15;	
		
		System.out.println(find(testArray,1));

	}

}
