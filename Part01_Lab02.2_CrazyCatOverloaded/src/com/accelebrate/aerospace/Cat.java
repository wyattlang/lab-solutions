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
	
	void jump(int distance) {
		System.out.println(this.name + " jumps " + distance + " feet");
	}
	
	void talk() {
		System.out.println("Meow!");
	}
	
	void talk(String words) {
		System.out.println(this.name + " says, \"" + words + "\"");
	}
	
	int calculateBirthYear(int currentYear) {
		return currentYear - age;
	}
	
}
