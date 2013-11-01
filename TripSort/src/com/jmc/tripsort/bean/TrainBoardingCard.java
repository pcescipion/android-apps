package com.jmc.tripsort.bean;

public class TrainBoardingCard extends BoardingCard {

	private String number;
	private String seat;

	public TrainBoardingCard(String from, String to) {
		super(from, to);
		super.setType("TRAIN");
	}

	public TrainBoardingCard(String from, String to, String number, String seat) {
		super(from, to);
		super.setType("TRAIN");		
		this.setSeat(seat);
		this.setNumber(number);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
}
