package SolidPrinciple;

public class Car extends VehicleInfo implements Vehicle{

	@Override
	public int getNumber() {
		return 123;
	}
	/*
	 * @Override public int vehicleNumber(Vehicle veh) { return this.getNumber(); }
	 */

}
