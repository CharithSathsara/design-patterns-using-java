package lk.charithsathsara.decoratorpattern;

import lk.charithsathsara.decoratorpattern.BasicCar;
import lk.charithsathsara.decoratorpattern.Car;
import lk.charithsathsara.decoratorpattern.LuxuryCar;
import lk.charithsathsara.decoratorpattern.SportsCar;

public class DecoratorPatternTest {
	
	public static void main(String[] args) {
		
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
