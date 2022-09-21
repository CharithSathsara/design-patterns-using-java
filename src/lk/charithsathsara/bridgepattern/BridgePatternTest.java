package lk.charithsathsara.bridgepattern;

import lk.charithsathsara.bridgepattern.GreenColor;
import lk.charithsathsara.bridgepattern.Pentagon;
import lk.charithsathsara.bridgepattern.RedColor;
import lk.charithsathsara.bridgepattern.Shape;
import lk.charithsathsara.bridgepattern.Triangle;

public class BridgePatternTest {
	
	public static void main(String[] args) {
		
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
