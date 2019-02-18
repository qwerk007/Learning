package com.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	
	private String address;
	private String pincode;
	private String state;
	private String country;
	private String city;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", pincode=" + pincode + ", state=" + state + ", country=" + country
				+ ", city=" + city + "]";
	}

}
