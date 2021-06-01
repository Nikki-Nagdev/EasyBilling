package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String contact;
	
	@Column(name="balance_due", nullable=true)
	private double balanceDue;
	
	@Column(name="updated_on", nullable=true)
	private Date updatedOn;
	
}
