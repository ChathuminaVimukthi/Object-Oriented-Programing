package vehicle.park;

//Vehicle type MotorBike
public class MotorBike extends Vehicle{
	//Extra Feature is engineSize
	private double engineSize;

	//constructor same as Vehicle with engineSize
	public MotorBike(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date,
			int hours, double engineSize) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.engineSize = engineSize;
	}

	//Getter & Setter for EngineSize
	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}


}
