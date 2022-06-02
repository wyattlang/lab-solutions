package com.accelebrate.aerospace;

class CatClient {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Garfield", 8);
		
		cat1.jump();
		cat1.jump(5);
		cat1.talk();
		cat1.talk("I like tuna!");
		
		int birthYear = cat1.calculateBirthYear(2022);
		System.out.println(cat1.name + "'s birth year is " + birthYear);

	}

}
