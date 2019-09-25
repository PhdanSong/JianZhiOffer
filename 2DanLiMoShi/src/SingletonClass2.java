
//懒汉式单例模式
public class SingletonClass2 {

	private static SingletonClass2 instance=null;
	//构造私有函数
	private SingletonClass2() {}
	public synchronized static SingletonClass2 getIntstance() {
		if(instance==null) {
			instance =new SingletonClass2();
		}
		return instance;
	}
}
