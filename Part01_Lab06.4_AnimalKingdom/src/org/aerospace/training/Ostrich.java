package org.aerospace.training;

import java.util.Objects;

class Ostrich extends Animal {

	private double speed;

	Ostrich(String name, double speed) {
		super(name);
		this.speed = speed;
	}
	
	@Override
	void speak() {
		System.out.println("trill, chirp, hiss!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(speed);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ostrich other = (Ostrich) obj;
		return Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		return "Ostrich [name=" + this.getName() + ", speed=" + speed + "]";
	}

	double getSpeed() {
		return speed;
	}
	
}
