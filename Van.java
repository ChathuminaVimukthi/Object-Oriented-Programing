package vehicle.park;

/*
Implemenation of Vehicle child class Van
*/
public class Van extends Vehicle {
	private double cargoVolume;

	/*
	Construct an instance of Van
	@param vehicleID - id of the vehicle
	@param vehicleBrand - the brand name of the vehicle
	@param vehicleType - the type of the vehicle
	@param year - the year the vehicle was manufactured
	@param month - the month the vehicle was manufactured
	@param date - the day of the month the vehicle was manufactured
	@param hours - the amount of time in hours to operate the vehicle
	@param cargoVolume - the cargo capacity of the vehicle
	@return null
	*/
	public Van(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			double cargoVolume) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.cargoVolume = cargoVolume;
	}

	/*
	Get the volume of the van's cargo
	@return cargoVolume - the volume of the cargo
	*/
	public double getCargoVolume() {
		return cargoVolume;
	}

	/*
	Set a new amount for the van's cargo volume
	@param cargoVolume - the van's new cargo volume
	@return null
	*/
	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	
}
