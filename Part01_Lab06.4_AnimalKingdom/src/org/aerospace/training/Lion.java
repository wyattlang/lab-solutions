package org.aerospace.training;

import java.util.Objects;

class Lion extends Animal {

	private boolean hasMane;

	Lion(String name, boolean hasMane) {
		super(name);
		this.hasMane = hasMane;
	}
	
	@Override
	void speak() {
		System.out.println("RAWWWRRR");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hasMane);
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
		Lion other = (Lion) obj;
		return hasMane == other.hasMane;
	}

	@Override
	public String toString() {
		return String.format("Lion [name=%s, hasMane=%s]", this.getName(), hasMane);
	}

	boolean isHasMane() {
		return hasMane;
	}
	
}
