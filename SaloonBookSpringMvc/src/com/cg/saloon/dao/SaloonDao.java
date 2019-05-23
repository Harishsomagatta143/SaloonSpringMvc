/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloondao interface where put methods
*/

package com.cg.saloon.dao;

import java.util.List;

import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;

public interface SaloonDao {

	public Saloon save(Saloon sal);
	public List<Saloon> findByName(String name);
	//public Customer save(Customer cus);
}
