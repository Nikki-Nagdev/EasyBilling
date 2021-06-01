package com.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class PurchaseInvoice extends Invoice {
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "party_id", referencedColumnName = "id")
	private Party party;
	private String paymentType;
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
