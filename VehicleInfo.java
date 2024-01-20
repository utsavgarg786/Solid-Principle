package SolidPrinciple;

public class VehicleInfo {

	public int vehicleNumber(Vehicle veh) {
		if(veh instanceof Car) {
			return veh.getNumber();
		}
		return 0;
	}
}
