/**
 * 
 */
package com.jmc.tripsort.bean;

/**
 * @author JMC
 * 
 */
public class AirBoardingCard extends BoardingCard {

	private String Gate;
	private String number;
	private String seat;

	public AirBoardingCard(String from, String to) {
		super(from, to);
		super.setType("FLY");
	}

	public AirBoardingCard(String from, String to, String gate,
			String number, String seat) {
		super(from, to);
		super.setType("FLY");
		this.setGate(gate);
		this.setSeat(seat);
		this.setNumber(number);

	}

	public String getGate() {
		return Gate;
	}

	public void setGate(String gate) {
		Gate = gate;
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
