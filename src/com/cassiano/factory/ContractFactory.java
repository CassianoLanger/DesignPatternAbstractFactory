package com.cassiano.factory;

public class ContractFactory extends Factory{

	@Override
	public Car retrieveCar(String requestedGrade) {

		if(requestedGrade.equals("A")) {
			return new Corola(100, "white", "gas", "Corolla");
		} else if(requestedGrade.equals("B")){
			return new Tesla(100, "grey", "electricity", "Tesla");
		}else{
			System.out.println("The requested car are not available!");
			return null;
		}
	}

}
