package org.aerospace.training;

class Zoo {

	public static void main(String[] args) {

		Animal ostrich = new Ostrich("Joe", 53);
		Animal giraffe = new Giraffe("Jane", 100);
		Animal lion = new Lion("Simba", false);
		
		ostrich.speak();
		giraffe.speak();
		lion.speak();
		
		System.out.println(ostrich);
		System.out.println(giraffe);
		System.out.println(lion);
		
	}

}
