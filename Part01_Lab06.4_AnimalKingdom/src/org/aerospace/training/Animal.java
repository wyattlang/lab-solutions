package org.aerospace.training;

import java.util.Objects;

class Animal {

	private String name;
	
	Animal(String name) {
		super();
		this.name = name;
	}

	void speak() {
		System.out.println("Animal speaks");
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	String getName() {
		return name;
	}
	
}
