package com.cg.saloon.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



//import com.cg.demomvcjavaconfig.configuration.WebMvc;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	/**
	 * @author hsomagat
	 * @return :- "AppContext"
	 * */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppContext.class};
	}
	/**
	 * @author hsomagat
	 * @return :- "WebMvc"
	 * */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebMvc.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
