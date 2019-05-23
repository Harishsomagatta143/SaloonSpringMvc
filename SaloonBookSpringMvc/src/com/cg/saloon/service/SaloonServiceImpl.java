/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloonserviceimpl class which implements bussiness logic
*/

package com.cg.saloon.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.saloon.dao.SaloonDao;
import com.cg.saloon.dao.SaloonDaoImpl;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;
 
@Service
@Transactional
public class SaloonServiceImpl implements SaloonService {
	//SaloonDaoImpl sal=new SaloonDaoImpl();
	@Autowired
SaloonDaoImpl saldao;
public SaloonServiceImpl() {
	 
}
public Saloon addSaloon(Saloon sal) throws SaloonNotFoundException {
	
	Saloon sal2=saldao.save(sal);
	if(sal2==null)
		 throw new SaloonNotFoundException();
	return saldao.save(sal);
}

public List<Saloon> searchByName(String name) throws SaloonNotFoundException {
	if(saldao.findByName(name).isEmpty())
		throw new SaloonNotFoundException("saloon not found");
	return saldao.findByName(name);
}
public Saloon assignCustomer(String name, Customer customer) throws SaloonNotFoundException {

	List<Saloon> saloon=saldao.findByName(name);
	for (Saloon saloon2 : saloon) {
		if(saloon2.getName().equals(name)) {
			
		List<Customer> customerList=saloon2.getCustomerList();
		customerList.add(customer);
		saloon2.setCustomerList(customerList);
		return saloon2;
		
		} 
		
	}
	if(saloon.isEmpty())
		throw new SaloonNotFoundException("saloon not found exception");
	return null;
	
}
/*@Override
public Customer addCustomer(Customer cus) {
	// TODO Auto-generated method stub
	return saldao.save(cus);
}*/


}
