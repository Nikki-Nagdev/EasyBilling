package com.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class SaleInvoice extends Invoice {
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	private String paymentType;
	private Date paymentDue;
	
	public SaleInvoice(Customer customer, String paymentType, Date paymentDue) {
		super();
		this.customer = customer;
		this.paymentType = paymentType;
		this.paymentDue = paymentDue;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPaymentDue() {
		return paymentDue;
	}

	public void setPaymentDue(Date paymentDue) {
		this.paymentDue = paymentDue;
	}
	
}
