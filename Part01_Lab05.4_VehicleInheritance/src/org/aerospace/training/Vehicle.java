package org.aerospace.training;

class Vehicle {

	private static final String MOVEMENT_MESSAGE = "Vehicle %s %.2f %smiles";
	
	private String type;
	
	Vehicle() {
		
	}
	
	String movement(double distance) {
		switch(this.getType()) {
			case "Plane":
				return formatMessage("flies", distance, "nautical ");
			case "Boat":
				return formatMessage("floats", distance, "nautical ");
			case "Car":
				return formatMessage("drives", distance, "");
			default:
				return "Invalid type for this vehicle";
		}
	}
	
	private String formatMessage(String verb, double distance, String nauticalOrNot) {
		return String.format(MOVEMENT_MESSAGE, verb, this.milesConversion(distance), nauticalOrNot);
	}
	
	private double milesConversion(double miles) {
		if (this.getType().equals("Plane") || this.getType().equals("Boat")) {
			return miles * 1.15078;
		}
		return miles;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
}
