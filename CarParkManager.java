import java.io.IOException;

//This is a Java interface class containing methods for managing parkings, which will be implemented by services
public interface CarParkManager {
	
	public void addVehicle();
	public void remove();
	public void calculateBill();
	public void specifiedDate() throws IOException;
	public void vehiclePercentage();
	public void longestParkedVehicle();
	public void view();
	

}
