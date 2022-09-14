package lk.charithsathsara.singletonpattern;

public class SingletonPattern {

	public static void main(String[] args) {
		
		//Since SingleObject() constructor is private, the constructor SingleObject() is not visible.
		//SingleObject object = new SingleObject();
		
		//get the only instance available
		SingleObject object =  SingleObject.getInstance();
		
		//show the message
		object.showMessage();
		
	}
	
}
