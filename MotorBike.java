package vehicle.park;

public class MotorBike extends Vehicle{
	private double engineSize;

	public MotorBike(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date,
			int hours, double engineSize) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.engineSize = engineSize;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}


}
