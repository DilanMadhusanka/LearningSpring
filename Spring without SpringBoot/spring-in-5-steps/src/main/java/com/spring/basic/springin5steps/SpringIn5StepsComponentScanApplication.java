package com.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basic.componentscan.ComponentDAO;
//import com.spring.basic.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.spring.basic.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDao);
	}

}
