package vehicle.park;
//Vehicle Van which extends Vehicle Class
public class Van extends Vehicle {
	//Extra Feature is cargoVolume
	private double cargoVolume;
	//Constructor same as Vehicle with cargoVolume
	public Van(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			double cargoVolume) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.cargoVolume = cargoVolume;
	}

	//Setter and getter for cargoVolume
	public double getCargoVolume() {
		return cargoVolume;
	}

	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	
}
