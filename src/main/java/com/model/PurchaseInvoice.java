package com.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class PurchaseInvoice extends Invoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date date;
	private double total;
	private double paid;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "party_id", referencedColumnName = "id")
	private Party party;
	
	@Column(name="payment_type", nullable=false)
	private String paymentType;
	@Column(name="payment_due", nullable=false)
	private Date paymentDue;

	
	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
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

	public PurchaseInvoice(Party party, int billNo, String paymentType, Date paymentDue) {
		super();
		this.party = party;
		this.paymentType = paymentType;
		this.paymentDue = paymentDue;
	}
	
	
}
