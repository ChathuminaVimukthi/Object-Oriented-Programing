import java.io.IOException;

//Interface for Parking Manager
public interface CarParkManager {

	//Adds a vehicle
	public void addVehicle();
	//Removes a vehicle
	public void remove();
	//Find Total Billed Cost
	public void calculateBill();
	//Specifies the date
	public void specifiedDate() throws IOException;
	//Finds Percentage of Vehicle Parked
	public void vehiclePercentage();
	//Finds Vehicle Parked for Longest time
	public void longestParkedVehicle();
	//Displays All vehicles
	public void view();
	

}
