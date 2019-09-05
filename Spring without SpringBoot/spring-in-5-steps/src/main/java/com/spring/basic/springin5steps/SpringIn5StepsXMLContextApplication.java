package com.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.spring.basic.springin5steps.xml.XmlPersonDAO;

//@Configuration
//@ComponentScan
public class SpringIn5StepsXMLContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			LOGGER.info("Beans Loaded -> {}",(Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		
//		System.out.println(personDao);
//		System.out.println(personDao.getXmlJdbcConnection());
		
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getXmlJdbcConnection());
		
		//applicationContext.close();
		}
	}

}
