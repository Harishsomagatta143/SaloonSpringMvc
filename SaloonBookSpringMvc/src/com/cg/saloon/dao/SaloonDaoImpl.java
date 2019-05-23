/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is saloondaoimpl class where we can implement logic
*/

package com.cg.saloon.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;

@Repository("saldao")
public class SaloonDaoImpl implements SaloonDao{

	@PersistenceContext
	EntityManager entitymanager;
	public SaloonDaoImpl() {
		
	}

	public Saloon save(Saloon sal) {
		// TODO Auto-generated method stub
		entitymanager.persist(sal);
		entitymanager.flush();
		return sal;
		//DBUtil.sal.add(sal);
		 //return sal;
	}

	public List<Saloon> findByName(String name) {
		
		
		List<Saloon> myList = new ArrayList<Saloon>();
		Saloon sal=new Saloon();
		//Getting saloon details based on name
		String qu ="from Saloon s where name=?1";
		Query query=  entitymanager.createQuery(qu,Saloon.class);
	
		query.setParameter(1, name);
	
		myList = query.getResultList();
		System.out.println("asdfgh"+myList);
		//myList.add(sal);
		return myList;
		/*List<Saloon> saloonList = new ArrayList<Saloon>();
		for (Saloon saloon :DBUtil.sal) {
			if(saloon.getName().equals(name))	{
				saloonList.add(saloon);	//saloon list added	
				return saloonList;}//return saloon list
*/			
	//}
		
		//return null;
	
	}

	/*@Override
	public Customer save(Customer cus) {
		// TODO Auto-generated method stub
		entitymanager.persist(cus);
		entitymanager.flush();
		return cus;
	}*/
}


