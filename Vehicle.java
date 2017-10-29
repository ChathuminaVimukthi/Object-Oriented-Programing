package vehicle.park;

//class for storing the values of a vehicle
public class Vehicle {
	private String vehicleId;
	private String vehicleBrand;
	private String vehicleType;
	private int year;
	private int month;
	private int date;
	private int hours;
	
	//preconditions: Strings for vehicleId, vehicleBrand, and vehicleType, and ints for year, month, date, hours 
	//postconidtions: the values for the entered values are stored in the class
	//throws: none
	public Vehicle(String vehicleId, String vehicleBrand, String vehicleType, int year, int month, int date,
			int hours) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleBrand = vehicleBrand;
		this.vehicleType = vehicleType;
		this.year = year;
		this.month = month;
		this.date = date;
		this.hours = hours;
	}
	
	//preconditions: none
	//postconditions: returns a string with the id of the vehicle
	//throws: none
	public String getVehicleId() {
		return vehicleId;
	}
	
	//preconditions: a String with the id of the vehicle
	//postconditions: the value of the vehicleId is changed to the entered string
	//throws: none
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	//preconditions: none
	//postconditions: returns a string with the vehicle brand
	//throws: none
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	
	//preconditions: a String with the value of the vehicle brand
	//postconditions: the value of the vehicleBrand is changed to the entered string
	//throws: none
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	
	//preconditions: none
	//postconditions: returns a string with the vehicle type
	//throws: none
	public String getVehicleType() {
		return vehicleType;
	}
	
	//preconditions: a String with the value of the vehicle type
	//postconditions: the value of the vehicleType is changed to the entered string
	//throws: none
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	//preconditions: none
	//postconditions: returns an int with the vehicle year
	//throws: none
	public int getYear() {
		return year;
	}
	
	//preconditions: an int with the value of the vehicle year
	//postconditions: changed the value of the vehicle year to the entered int
	//throws: none
	public void setYear(int year) {
		this.year = year;
	}
	
	//preconditions: none
	//postconditions: returns an int with the month
	//throws: none
	public int getMonth() {
		return month;
	}
	
	//preconditions: an int with the value of the month
	//postcondition: the value of the month is changed to the entered month
	//throws: none
	public void setMonth(int month) {
		this.month = month;
	}
	
	//preconditions: none
	//postconditions: returns an int with the date
	//throws: none
	public int getDate() {
		return date;
	}
	
	//preconditions: an int with the value of the date
	//postconditions: the value of the date is changed to the entered date
	//throws: none
	public void setDate(int date) {
		this.date = date;
	}
	
	//preconditions: none
	//postconditions: returns an int with the hours
	//throws: none
	public int getHours() {
		return hours;
	}
	
	//preconditions: an int with the value of the hours
	//postconditions: the value of the hours is changed to the entered hourss
	//throws: none
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	DateTime dateTime = new DateTime(year, month, date, hours);

}
