package com.cassiano.factory;

public class Car {

	private int horsePower;
	private String color;
	private String fuelSource;
	private String brand;
	
	public Car(int horsePower, String color, String fuelSource, String brand) {
		this.horsePower = horsePower;
		this.color = color;
		this.fuelSource = fuelSource;
		this.brand = brand;
	}
	
	public void startEngine() {
		StringBuilder stringBuilder= new StringBuilder();
		stringBuilder.append("The ").append(fuelSource).append(" engine has been started, and is ready to utilize ").append(horsePower);
		System.out.println(stringBuilder.toString());
	}
	
	public void clean() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("The ").append(color).append(" ").append(brand).append(" has been clened");
		System.out.println(stringBuilder.toString());
	}

	public void mechanicCheck() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("The ").append(color).append(" ").append(brand).append(" is alredy checked by mechanic. Everything is working as should.");
		System.out.println(stringBuilder.toString());
	}

	public void fuelCar() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("The ").append(color).append(" ").append(brand).append("being filled by ").append(fuelSource);
		System.out.println(stringBuilder.toString());
		System.out.println("----------------------------------------------------------------------------------------------");
	}
	
}
