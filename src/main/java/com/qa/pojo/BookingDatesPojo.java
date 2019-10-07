package com.qa.pojo;

public class BookingDatesPojo {
	
	private String checkin;
	private String checkout;
	
	public BookingDatesPojo(String checkin, String checkout) {
		
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public String getCheckin() {
		return checkin;
	}

	public String getCheckout() {
		return checkout;
	}
	
	
	
	

}
