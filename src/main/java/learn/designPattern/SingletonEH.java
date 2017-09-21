package learn.designPattern;

public class SingletonEH {

	private static SingletonEH singletonEH = new SingletonEH();

	private SingletonEH() {
		super();
	}

	public SingletonEH getInstance() {
		return singletonEH;
	}

}
