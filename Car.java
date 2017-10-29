package vehicle.park;

/**
 * Object for storing information related to a car.
 */
public class Car extends Vehicle{
	// The number of doors on the car
	private int numofDoors;
	// The color of the car
	private String color;

	/**
	 * Constructor used to fill the car object with related information.
	 * @param vehicleId, a string containing the vehicle ID.
	 * @param vehicleBrand, a string containing the vehicle brand.
	 * @param vehicleType, a string containing the vehicle type.
	 * @param year, an int containing the year.
	 * @param month, an int containing the month.
	 * @param date, an int containing the date.
	 * @param hours, an int containing the hours.
	 * @param numofDoors, an int containing the number of doors.
	 * @param color, a string containing the color.
	 */
	public Car(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			int numofDoors, String color) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.numofDoors = numofDoors;
		this.color = color;
	}

	/**
	 * Method for retrieving the number of doors on a car.
	 * @returns int containing the number of doors of the car.
	 */
	public int getNumofDoors() {
		return numofDoors;
	}

	/**
	 * Method for setting the number of doors on a car.
	 * @param numofDoors, an int containing the new number of doors.
	 */
	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	/**
	 * Method for retrieving the color of a car.
	 * @returns string containing the color of the car.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Method for setting the color of a car.
	 * @param color, a string containing the new color.
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
