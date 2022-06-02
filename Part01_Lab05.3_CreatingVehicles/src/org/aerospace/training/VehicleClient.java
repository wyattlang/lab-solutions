package org.aerospace.training;

class VehicleClient {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setType("Plane");
		String message = vehicle.movement(343);
		System.out.println(message);
	}

}
