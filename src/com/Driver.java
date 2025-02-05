package com;

public class Driver {
    private int driverId;
    private String driverName;
    private String category;
    private double distanceTravelled;
    
    
    
    public Driver() {
		super();
	}

	public Driver(int driverId, String driverName, String category, double distanceTravelled) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.distanceTravelled = distanceTravelled;
	}
    
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", category=" + category
				+ ", distanceTravelled=" + distanceTravelled + "]";
	}
	
    
}
