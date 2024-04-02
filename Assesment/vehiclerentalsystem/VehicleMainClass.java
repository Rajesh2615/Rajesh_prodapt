package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleMainClass {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("1", "Car", true, 5));
		vehicles.add(new Vehicle("2", "Bike", true, 2));
		VehicleRentalSystem rentalSystem = new VehicleRentalSystem(vehicles);
		RentalRequest request = new RentalRequest("Bike", 1);
		try {
			rentalSystem.processRentalRequest(request);
		} catch (VehicleUnavailableException | InvalidRentalPeriodException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
