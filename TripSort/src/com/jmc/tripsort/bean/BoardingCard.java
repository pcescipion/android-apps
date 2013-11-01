package com.jmc.tripsort.bean;
public class BoardingCard {
	
	public static String type;
	protected String from;
	protected String to;
	protected String remarks;
	
	
	public BoardingCard(String from, String to){
		
		this.setFrom(from);
		this.setTo(to);
	}

	public void showItinerary() {
		System.out.println("Boarding Card from: " + this.getFrom() + " to: "
				+ this.getTo());
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		BoardingCard.type = type;
	}
}
