package com.jmc.tripsort.bean;

public class CruiserBoardingCard extends BoardingCard {
	
	private String dock;
	private String cabinNumber;		

	
	public CruiserBoardingCard(String from, String to){
		super(from, to);
		super.setType("Cruiser");
	}
	
	public CruiserBoardingCard(String from, String to, String number, String cabinNumber, String dock) {
		super(from, to);
		super.setType("Cruiser");
		this.setCabinNumber(cabinNumber);
		this.setDock(dock);
		
	}

	public String getDock() {
		return dock;
	}

	public String getCabinNumber() {
		return cabinNumber;
	}

	public void setDock(String dock) {
		this.dock = dock;
	}

	public void setCabinNumber(String cabinNumber) {
		this.cabinNumber = cabinNumber;
	}
}
