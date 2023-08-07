package package1;

import package2.FinalModifier2;

public class AreaOfCircle {
	public void area() {
		float area,radius = 5f;
		area = radius*radius*FinalModifier2.PI;
		System.out.println(area);
	}
	public void display() {
		System.out.println("Area Of Circle");
	}

}
