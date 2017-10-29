package vehicle.park;

public class Van extends Vehicle {
	private double cargoVolume;
//parameterized constructor
	public Van(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			double cargoVolume) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.cargoVolume = cargoVolume;
	}
//getter method for van cargo volume
	public double getCargoVolume() {
		return cargoVolume;
	}
//setter method for van cargo volume
	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	
}
