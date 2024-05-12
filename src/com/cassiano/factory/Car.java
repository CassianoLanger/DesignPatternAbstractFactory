package com.cassiano.factory;

public class Car {

	private int hourPower;
	private String color;
	private String fuelSource;
	
	public Car(int hourPower, String color, String fuelSource) {
		this.hourPower = hourPower;
		this.color = color;
		this.fuelSource = fuelSource;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelSource() {
		return fuelSource;
	}

	public void setFuelSource(String fuelSource) {
		this.fuelSource = fuelSource;
	}

	public int getHourPower() {
		return hourPower;
	}
	
	public void setHourPower(int hourPower) {
		this.hourPower = hourPower;
	}
	
}
