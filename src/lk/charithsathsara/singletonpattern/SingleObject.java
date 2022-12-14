package lk.charithsathsara.singletonpattern;

public class SingleObject {
	
	//An object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	//make the constructor private so that this SingleObject class can not be instantiated
	private SingleObject() {}
	
	//get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello Charith Sathsara!");
	}
	

}
