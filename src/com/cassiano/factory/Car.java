package com.cassiano.factory;

public class Car {

	private int horsePower;
	private String color;
	private String fuelSource;
	
	public Car(int horsePower, String color, String fuelSource) {
		this.horsePower = horsePower;
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
		return horsePower;
	}
	
	public void setHourPower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void startEngine() {
		StringBuilder stringBuilder= new StringBuilder();
		stringBuilder.append("The ")
					 .append(fuelSource)
					 .append(" engine has been started, and is ready to utilize ")
					 .append(horsePower);
		System.out.println(stringBuilder.toString());
	}
	
	public void clean() {
		
	}

	public void mechanicCheck() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("The car is alredy checked by mechanic. Everything is working as should.");
	}

	public void fuelCar() {
		System.out.println("Car is being filled by " + fuelSource.toLowerCase());
	}
	
}
