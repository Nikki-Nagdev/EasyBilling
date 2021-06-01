package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Firm {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
	
	private String name;
	private String GSTIN;
	private String ownerName;
	private String contact;
	private String address;
	private String email;
	private String businessType;
	
	
	public Firm(String name, String gSTIN, String ownerName, String contact, String address, String email,
			String businessType) {
		super();
		this.name = name;
		GSTIN = gSTIN;
		this.ownerName = ownerName;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.businessType = businessType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGSTIN() {
		return GSTIN;
	}

	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
