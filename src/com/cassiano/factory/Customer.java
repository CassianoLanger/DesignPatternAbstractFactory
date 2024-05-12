package com.cassiano.factory;

public class Customer {

	private String gradeRequest;
	private boolean hasCompanyContract;
	
	public Customer(String gradeRequest, boolean hasCompanyContract) {
		this.gradeRequest = gradeRequest;
		this.hasCompanyContract = hasCompanyContract;
	}
	
	public String gradeRequest() {
		return gradeRequest;
	}
	
	public boolean hasCompanyContract() {
		return hasCompanyContract;
	}
	
}
