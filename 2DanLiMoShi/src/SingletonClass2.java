
//����ʽ����ģʽ
public class SingletonClass2 {

	private static SingletonClass2 instance=null;
	//����˽�к���
	private SingletonClass2() {}
	public synchronized static SingletonClass2 getIntstance() {
		if(instance==null) {
			instance =new SingletonClass2();
		}
		return instance;
	}
}
