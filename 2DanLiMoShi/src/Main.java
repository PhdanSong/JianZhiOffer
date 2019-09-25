//网址:https://max.book118.com/html/2017/0905/131968485.shtm
//error
//不是说是单例模式吗？为什么还会生成20个instance？
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			System.out.println(SingletonClass.getInstance());
			System.out.println(SingletonClass2.getIntstance());
		}
	}

}
