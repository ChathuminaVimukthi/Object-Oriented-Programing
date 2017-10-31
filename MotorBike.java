package vehicle.park;

public class MotorBike extends Vehicle{
	private double engineSize;

	/*Constructor for MotorBike class*/
	public MotorBike(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date,
			int hours, double engineSize) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.engineSize = engineSize;
	}

	/*Getter for engineSize field*/
	public double getEngineSize() {
		return engineSize;
	}
	
	/*Setter for engineSizeField*/
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}


}
