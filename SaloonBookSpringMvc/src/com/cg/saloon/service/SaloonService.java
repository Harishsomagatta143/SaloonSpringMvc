/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is interface where put functionalities
*/

package com.cg.saloon.service;

import java.util.List;

import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;
 

public interface SaloonService {

	
	public  Saloon addSaloon(Saloon sal) throws SaloonNotFoundException;
	public  List<Saloon>searchByName(String name) throws SaloonNotFoundException;
	public  Saloon assignCustomer(String name, Customer customer) throws SaloonNotFoundException  ;
	//public Customer addCustomer(Customer cus);
	public static List<Customer> assignCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
