package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@javax.persistence.Id
	private long Id;
	private String firstName;
	private String lastName;
	private String phone;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Users [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	
}
