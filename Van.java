package vehicle.park;

public class Van extends Vehicle {
	private double cargoVolume;

	public Van(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			double cargoVolume) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.cargoVolume = cargoVolume;
	}

	public double getCargoVolume() {
		return cargoVolume;
	}

	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	
}
