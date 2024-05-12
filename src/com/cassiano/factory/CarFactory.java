package com.cassiano.factory;

public class CarFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
		case "A":
			return new Volkswagem(100,"full","blue");
		case "B":
			return new Toyota(100,"full","blue");
		default:
			System.out.println("The requested car are not available!");
			return null;
		}
	}

}
