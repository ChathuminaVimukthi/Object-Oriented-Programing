package vehicle.park;

//model class for vehicles
public class Vehicle {
	private String vehicleId;
	private String vehicleBrand;
	private String vehicleType;
	private int year;
	private int month;
	private int date;
	private int hours;
	
	//constructor with parameter vehicleId,vehicleBrand,vehicleType,year,month,date,hours
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
	
	//Setter & Getter Functions
	//VehicleId
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	//VehicleBrand
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	//VehicleType
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	//Year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//Month
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	//Date
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	//Hours
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	//setting variable dateTime
	DateTime dateTime = new DateTime(year, month, date, hours);

}
