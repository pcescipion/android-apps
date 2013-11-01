package com.jmc.tripsort.bean;

public class BusBoardingCard extends BoardingCard {

	private String number;

	public BusBoardingCard(String from, String to) {
		super(from, to);
		super.setType("BUS");
	}

	public BusBoardingCard(String from, String to, String number) {
		super(from, to);
		super.setType("BUS");
		this.setNumber(number);
		
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
