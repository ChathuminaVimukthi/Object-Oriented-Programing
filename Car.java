package vehicle.park;

//class to store the values of cars 
//extends the vehicle classs
public class Car extends Vehicle{
	private int numofDoors; //integer value for the number of doors the car has
	private String color; //string for the color of the car
	
	//preconditions: the id of the vehicle, the brand of the vehicle, and the type, all entered as strings, the year, 
	//       month, date, hours, and number of doors entered as ints, and the color entered as a String.
	//postconditions: the constructor in the parent class is called and the values for ID, Brand, Type, Year,
	//        Month, Date, and Hours are passed to it, then the value for the number of doors and the color are set
	//Throws: None
	
	public Car(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date, int hours,
			int numofDoors, String color) {
		super(vehicleId, vehicleBrand, vehicleType, year, month, date, hours);
		this.numofDoors = numofDoors;
		this.color = color;
	}

	//preconditions: none
	//postconditions: returns the number of doors on the car
	//Throws: none
	public int getNumofDoors() {
		return numofDoors;
	}

	//preconditions: int value of number of doors
	//postconditions: the value for the number of doors is changed to the entered integer
	//throws: none
	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	//preconditions: none
	//postconditions: a string is returned with the value of the color of the car
	//Throws: none
	public String getColor() {
		return color;
	}

	//preconditions: String with the value for the color
	//postconditions: The color of the car is set to the entered string
	//Throws: none
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
