package com.accelebrate.aerospace;

class DogClient {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Jeff", 5);
		Dog dog2 = new Dog("Jill", 10);
		
		System.out.println(dog1.name + "'s age is " + dog1.age);
		System.out.println(dog2.name + "'s age is " + dog2.age);
		
	}

}
