
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This  is address class where set address details
*/
package com.cg.saloon.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="address_id")
	private Integer id;
	@Column(name="city")
	    private String city;
	@Column(name="state")
	    private String state; 
	@Column(name="postalcode")
	    private long postalcode;
    
    
    
	public Address() {
		super();
	
	}
	
	
	public Address(Integer id, String city, String state, long postalcode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}


	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", postalcode=" + postalcode + "]";
	}
	
 
    
}
