package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String HSN;
	
	@Column(name="party_id", nullable=true)
	private int partyId;
	private int category;
	
	
	@Column(name="cost_price", nullable=false)
	private float costPrice;
	
	@Column(name="profit_percent", nullable=false)
	private float profitPercent;
	
	@Column(name="profit_amount", nullable=false)
	private float profitAmount;
	
	@Column(name="amount_percent_flag", nullable=false)
	private boolean amountPercentFlag;
	

	public Item(int id, String name, float costPrice, float profitPercent,
			float profitAmount, boolean amountPercentFlag) {
		super();
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.profitPercent = profitPercent;
		this.profitAmount = profitAmount;
		this.amountPercentFlag = amountPercentFlag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public float getProfitPercent() {
		return profitPercent;
	}

	public void setProfitPercent(float profitPercent) {
		this.profitPercent = profitPercent;
	}

	public float getProfitAmount() {
		return profitAmount;
	}

	public void setProfitAmount(float profitAmount) {
		this.profitAmount = profitAmount;
	}

	public boolean isAmountPercentFlag() {
		return amountPercentFlag;
	}

	public void setAmountPercentFlag(boolean amountPercentFlag) {
		this.amountPercentFlag = amountPercentFlag;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", costPrice=" + costPrice + ", profitPercent=" + profitPercent + ", profitAmount=" + profitAmount + ", amountPercentFlag="
				+ amountPercentFlag + "]";
	}
	
	

}
