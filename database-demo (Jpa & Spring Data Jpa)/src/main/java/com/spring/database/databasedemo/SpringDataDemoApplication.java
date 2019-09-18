package com.spring.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.databasedemo.entity.Person;
import com.spring.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User od 10001 - > {}", repository.findById(10001));
		logger.info("Updating 10003 -> {}", repository.save(new Person(10003, "Owa", "Banckok", new Date())));
		logger.info("Inserting 10004 -> {}", repository.save(new Person("Shake", "New Delli", new Date())));
		
		repository.deleteById(10002);
		
		logger.info("All users -> {}",repository.findAll());
	}

}
