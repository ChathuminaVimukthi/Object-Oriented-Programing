package vehicle.park;


//subclass for storing car information and extending vehicle class
public class Car extends Vehicle{
	private int numofDoors;
	private String color;

	//construtor for initialising variables of vehicle class under sublass car
	public Car(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			int numofDoors, String color) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.numofDoors = numofDoors;
		this.color = color;
	}

	//function returning number of doors
	public int getNumofDoors() {
		return numofDoors;
	}

	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	//function returning color of car
	public String getColor() {
		return color;
	}

	//function for setting color of car
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
