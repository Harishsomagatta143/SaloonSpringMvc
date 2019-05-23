package com.cg.saloon.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.saloon.dto.Address;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;
import com.cg.saloon.service.SaloonService;
@Controller
public class MyController {

	Saloon sal2;
	@Autowired
	SaloonService saloonService;
	/*@GetMapping("add")
	public ModelAndView getSaloon(@ModelAttribute("sal") Saloon sal) {
		return new ModelAndView("addSaloon");
	}*/
	

	/**
	 * @author hsomagat * 
	 * @return :- "listsaloon"

	 * */
	@GetMapping("saloon")
	public String menuSaloon () {
		//Saloon saloon=saloonService.addSaloon(sal);
		return "listsaloon";
	}
	/**
	 * @author hsomagat
	 * @return :- "addsaloon"
	 * */
	@GetMapping("add")
	public ModelAndView getSaloon(@ModelAttribute("sal") Saloon salon) {
		return new ModelAndView("addsaloon");
	}
	/**
	 * @author hsomagat
	 * @return :- "assigning"
	 * */
	
	@PostMapping("addSaloon")
	public ModelAndView addSaloon(@ModelAttribute("sal") Saloon salon) throws SaloonNotFoundException  {
		   salon.setAddress( salon.getAddress());
		   
		   //salon.setCustomerList( salon.getCustomerList());
		//salon=saloonService.addSaloon(salon);
		this.sal2=salon;		  
		return new ModelAndView("assigning");
	}/**
	 * @author hsomagat
	 * @return :- "success"
	 * */
	@PostMapping("assign")
	public ModelAndView addSalooncust(@RequestParam("customername") String name,@RequestParam("customerid") int id,@RequestParam("customeremail") String emailid,@RequestParam("customermobileNumber")BigInteger mobileNumber) throws SaloonNotFoundException {
	 //System.out.println(pro);
	 Customer custone=new Customer();
	 custone.setName(name);  
	 custone.setId(id);
	 custone.setEmail(emailid);
	 custone.setMobileNumber(mobileNumber);
	 custone.setId(id);
	 List<Customer> custList=new ArrayList<>();
	 custList.add(custone);
	 Saloon sal=new Saloon();
	 sal.setId(sal2.getId());
	 sal.setName(sal2.getName());
	 sal.setPhoneNumber(sal2.getPhoneNumber());
	 sal.setAddress(sal2.getAddress()); 
	 sal.setCustomerList(custList);
	// System.out.println("Controller"+sal);
	 saloonService.addSaloon(sal);
	 return new ModelAndView("success");
	}
	
	/**
	 * @author hsomagat
	 * @return :- "searchsaloon"
	 * */
	@GetMapping("searchpage")
	public String searchPage() {
	 return "searchsaloon";
	}
	/**
	 * @author hsomagat
	 * @return :- "searchresult"
	 * */
	@PostMapping("searchpost")
	public ModelAndView showsaloon(@RequestParam("Addsaloon") String name) throws SaloonNotFoundException {

	 List <Saloon>searchresult=null;
	 try {
		 searchresult=saloonService.searchByName(name);
		
		
		 
	 }catch (SaloonNotFoundException e) {
		 System.out.println("zdfh");
		return new ModelAndView("error");
	 }
	 return new ModelAndView("showsaloon","show",searchresult);
	// eve.setEventName(name);
	 //Event eventSearch=delegateservice.eventInfo(eve);
	 //return new ModelAndView("searchresult","showeventsearch",eventSearch);
	} 
	/**
	 * @author hsomagat
	 * @return :- "listsaloon"
	 * */
	@GetMapping("goHome")
	public ModelAndView goHomePgae()
	{
		return new ModelAndView("listsaloon");
		
	}
}
