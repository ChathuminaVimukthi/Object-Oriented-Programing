package vehicle.park;


public class Car extends Vehicle{
	private int numofDoors;
	private String color;

	/**
	 *  Car constructor
	 *  @param vehicleId The vehicle id of the Car
	 *  @param vehicleBrand The brand of Car
	 *  @param vehicleType The type of Car
	 *  @param year The year of the Car
	 *  @param month The month of the Car
	 *  @param date The date of the Car
	 *  @param hours The hours of the Car
	 *  @param numofDoors The number of doors on the Car
	 *  @param color The color of the Car
	 *  @return instance of a Car
	 */
	public Car(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			int numofDoors, String color) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.numofDoors = numofDoors;
		this.color = color;
	}

	/**
	 *  Gets the number of doors that the Car has
	 *  @return the number of doors
	 */
	public int getNumofDoors() {
		return numofDoors;
	}

	/**
	 *  Sets the number of doors that the car has
	 *  @param numofDoors the number of doors to set
	 */
	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	/**
	 *  Gets the color of the car
	 *  @return the color of the car
	 */
	public String getColor() {
		return color;
	}

	/**
	 *  Sets the color of the car
	 *  @param the color of the car
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
