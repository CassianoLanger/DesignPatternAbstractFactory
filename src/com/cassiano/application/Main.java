package com.cassiano.application;

import com.cassiano.factory.ContractFactory;
import com.cassiano.factory.Customer;
import com.cassiano.factory.Factory;
import com.cassiano.factory.WithoutContractFactory;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("A", true);
		Customer customer2 = new Customer("A", false);
		Customer customer3 = new Customer("B", true);
		Customer customer4 = new Customer("B", false);
		
		Factory factory = getFactory(customer);
		factory.create(customer.getGradeRequest());
		
		Factory factory2 = getFactory(customer2);
		factory2.create(customer.getGradeRequest());
		
		Factory factory3 = getFactory(customer3);
		factory3.create(customer3.getGradeRequest());
		
		Factory factory4 = getFactory(customer4);
		factory4.create(customer4.getGradeRequest());
	}

	private static Factory getFactory(Customer customer) {
		if(customer.hasCompanyContract()) {
			return new ContractFactory();
		} else {
			return new WithoutContractFactory();
		}
	}
}
