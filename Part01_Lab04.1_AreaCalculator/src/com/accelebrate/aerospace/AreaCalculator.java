package com.accelebrate.aerospace;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

class AreaCalculator {

	private double radius;
	
	double calcArea() {
		return PI * pow(radius, 2);
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
}
