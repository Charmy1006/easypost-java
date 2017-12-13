package com.easypost.model;

public class Fees {

	String object;

	String type;

	String amount;

	Boolean charged;

	Boolean refunded;

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Boolean getCharged() {
		return charged;
	}

	public void setCharged(Boolean charged) {
		this.charged = charged;
	}

	public Boolean getRefunded() {
		return refunded;
	}

	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}

}
