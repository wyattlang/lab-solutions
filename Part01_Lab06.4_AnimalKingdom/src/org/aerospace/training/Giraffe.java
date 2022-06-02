package org.aerospace.training;

import java.util.Objects;

class Giraffe extends Animal {

	private double neckLength;

	Giraffe(String name, double neckLength) {
		super(name);
		this.neckLength = neckLength;
	}
	
	@Override
	void speak() {
		System.out.println("ooeoeeeuuu");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(neckLength);
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
		Giraffe other = (Giraffe) obj;
		return Double.doubleToLongBits(neckLength) == Double.doubleToLongBits(other.neckLength);
	}

	@Override
	public String toString() {
		return String.format("Giraffe [name=%s, neckLength=%s]", this.getName(), neckLength);
	}

	double getNeckLength() {
		return neckLength;
	}
	
}
