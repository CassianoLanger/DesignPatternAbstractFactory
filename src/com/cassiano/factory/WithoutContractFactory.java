package com.cassiano.factory;

public class WithoutContractFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
		case "A":
			return new Volkswagem(100, "red", "gas", "Volkswagem");
		case "B":
			return new Toyota(100, "black", "gas", "Toyota");
		default:
			System.out.println("The requested car are not available!");
			return null;
		}
	}

}
