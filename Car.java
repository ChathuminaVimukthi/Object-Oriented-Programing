package vehicle.park;

// This class respresents a car like object,
// and returns number of doors and the color that car.
public class Car extends Vehicle{
	private int numofDoors;
	private String color;

	public Car(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			int numofDoors, String color) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.numofDoors = numofDoors;
		this.color = color;
	}

	public int getNumofDoors() {
		return numofDoors;
	}

	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
