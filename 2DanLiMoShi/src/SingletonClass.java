
public class SingletonClass {
	private static final SingletonClass instance = new SingletonClass();
	//˽�й��캯��
	private SingletonClass() {}
	public static SingletonClass getInstance() {
		return instance;
	}

}
