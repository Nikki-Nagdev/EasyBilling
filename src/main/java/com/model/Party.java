package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Party {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String contact;
	
	@Column(name="billing_address", nullable=true)
	private String billingAddress;
	
	private String email;
	
	@Column(name="gst_type", nullable=true)
	private String GSTType;
	private String state;
	
	@Column(name="opening_balance", nullable=true)
	private double openingBalance;
	
	@Column(name="updated_on", nullable=true)
	private Date updatedOn;

	public Party(int id, String contact, String billingAddress, String email, String gSTType, String state,
			double openingBalance, Date updatedOn) {
		super();
		this.id = id;
		this.contact = contact;
		this.billingAddress = billingAddress;
		this.email = email;
		GSTType = gSTType;
		this.state = state;
		this.openingBalance = openingBalance;
		this.updatedOn = updatedOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGSTType() {
		return GSTType;
	}

	public void setGSTType(String gSTType) {
		GSTType = gSTType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
}
