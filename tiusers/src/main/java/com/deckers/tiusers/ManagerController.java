package com.deckers.tiusers;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ManagerController  implements WebMvcConfigurer {
	public void addViewControllers(ViewControllerRegistry registry) {
		   registry.addViewController("/home").setViewName("home");
	        registry.addViewController("/").setViewName("home");
	        registry.addViewController("/hello").setViewName("hello");
	}
}
