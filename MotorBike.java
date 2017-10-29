package vehicle.park;

//class extending vehicle for motorbikes
public class MotorBike extends Vehicle{
	private double engineSize; //double for the size of the engine
	
	//preconditions: String for vehicleId, vehicleBrand, vehicleType, and int for year, month date, hours, and double for enginesize
	//postconditions: the constructor in the parents class is called and the values for id, brand, type, year,month,date, and hours
		// are passed to it, then the value for the engine size is set
	//throws: none
	public MotorBike(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date,
			int hours, double engineSize) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.engineSize = engineSize;
	}

	//preconditions: none
	//postconditions: a double with the value of the enginesize is returned
	//throws: none
	public double getEngineSize() {
		return engineSize;
	}

	//preconditions: a double with the value of the engineSize
	//postconditions: the value of the engineSize is changed to the entered double
	//throws: none
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}


}
