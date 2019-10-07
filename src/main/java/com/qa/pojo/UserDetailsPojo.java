package com.qa.pojo;

public class UserDetailsPojo {
	
	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;
	private String additionalneeds;
	private BookingDatesPojo bookingDates;
	
	public UserDetailsPojo(String firstname, String lastname, int totalprice, boolean depositpaid,
			String additionalneeds, BookingDatesPojo bookingDates) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.additionalneeds = additionalneeds;
		this.bookingDates = bookingDates;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public boolean isDepositpaid() {
		return depositpaid;
	}

	public String getAdditionalneeds() {
		return additionalneeds;
	}

	public BookingDatesPojo getBookingDates() {
		return bookingDates;
	}
	
	
	
	
	
	

}
