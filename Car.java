package vehicle.park;

//Vehicle Type Car
public class Car extends Vehicle{
	//Extra Features numofDoors,color
	private int numofDoors;
	private String color;

	//Constructor same as Vehicle with numofDoors and color
	public Car(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			int numofDoors, String color) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.numofDoors = numofDoors;
		this.color = color;
	}

	//Getter & Setter Functions
	//numofDoors
	public int getNumofDoors() {
		return numofDoors;
	}

	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	//color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
