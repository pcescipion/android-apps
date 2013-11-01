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
	private String flyNumber;
	private String seat;

	public AirBoardingCard(String from, String to) {
		super(from, to);
		super.setType("FLY");
		
	}
	
	public AirBoardingCard(String from, String to,String gate,String flyNumber,String seat) {
		super(from, to);
		super.setType("FLY");
		this.setGate(gate);
		this.setSeat(seat);
		
	}

	public String getGate() {
		return Gate;
	}

	public void setGate(String gate) {
		Gate = gate;
	}

	public String getFlyNumber() {
		return flyNumber;
	}

	public void setFlyNumber(String flyNumber) {
		this.flyNumber = flyNumber;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

}
