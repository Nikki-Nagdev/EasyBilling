package com.model;

import java.sql.Date;

public class Invoice {
	
	private int id;
	private Date date;
	private double total;
	private double paid;
	
	public Invoice() {}
	
	public Invoice(Date date, double total, double paid) {
		super();
		this.date = date;
		this.total = total;
		this.paid = paid;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getPaid() {
		return paid;
	}
	public void setPaid(double paid) {
		this.paid = paid;
	}
	
	
}
