package com.accelebrate.aerospace;

class Cat {

	String name;
	int age;
	
	Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void jump() {
		System.out.println(this.name + ", get down off the fridge!");
	}
	
	void talk() {
		System.out.println("Meow!");
	}
	
	int calculateBirthYear(int currentYear) {
		return currentYear - age;
	}
	
}
