/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloon class where set saloon details
*/

package com.cg.saloon.dto;


import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@Table(name="saloon")
public class Saloon {
	@Id
	@Column(name="saloon_id")
	private Integer id;
	@Column(name="saloon_name")
	private String name;
	@Column(name="phonenumber")
	private BigInteger phoneNumber; 
	@OneToMany(cascade=CascadeType.ALL )
	@JoinColumn(name="saloon_id")
	private  List<Customer> customerList;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address; 
	
	
	public Saloon(Integer id, String name, BigInteger phoneNumber, List<Customer> customerList, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.customerList = customerList;
		this.address = address;
	}
	public Saloon() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	@Override
	public String toString() {
		return "Saloon [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", customerList=" + customerList
				+ ", address=" + address + "]";
	}
	
}
