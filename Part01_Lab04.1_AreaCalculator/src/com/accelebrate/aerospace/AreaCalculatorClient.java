package com.accelebrate.aerospace;

class AreaCalculatorClient {

	public static void main(String[] args) {

		AreaCalculator calc = new AreaCalculator();
		calc.setRadius(5);
		System.out.println(calc.calcArea());
		
	}

}
