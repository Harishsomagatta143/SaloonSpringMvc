
/*@Author hsomagat
*Project name:SaloonBookApplication
*  This is WebMvc class 
*/
package com.cg.saloon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan("com.cg.saloon.config")
public class WebMvc implements WebMvcConfigurer {
	/**
	 * @author hsomagat
	 * @return :- "viewresolver"
	 * */
	@Bean
	public InternalResourceViewResolver getAllView()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;	
	}
}
