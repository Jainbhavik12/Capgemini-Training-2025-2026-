package SmartCityTrafficManagementSystem;

import java.util.Objects;

public class Vehicle {
	private String vehicleNumber;
	private String type;
	private String checkPoint;
	private long timeStamp;
	
	
	
	public Vehicle(String vehicleNumber, String type, String checkPoint) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.checkPoint = checkPoint;
		this.timeStamp = System.currentTimeMillis();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(vehicleNumber, timeStamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(checkPoint, other.checkPoint) && timeStamp == other.timeStamp
				&& Objects.equals(type, other.type) && Objects.equals(vehicleNumber, other.vehicleNumber);
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", type=" + type + ", checkPoint=" + checkPoint
				+ ", timeStamp=" + timeStamp + "]";
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public String getCheckPoint() {
		return checkPoint;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
