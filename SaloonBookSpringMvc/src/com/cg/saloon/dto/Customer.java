/*@Author hsomagat
*Project name:SaloonBookApplication
*  This customer class where set customer details
*/

package com.cg.saloon.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="customer_id")
	private int id ;
	@Column(name="customer_name")
	private String name ;
	@Column(name="customer_emailid")
	private String email;
	@Column(name="customer_mobilenumber")
	private BigInteger mobileNumber ;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String email, BigInteger mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
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
	 
	public String getEmail() {
		return email;
	}
	public void setEmail(String emailId) {
		this.email = emailId;
	}
	public BigInteger getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailId=" + email + ", mobileNumber=" + mobileNumber
				+ "]";
	}

	
	
}
