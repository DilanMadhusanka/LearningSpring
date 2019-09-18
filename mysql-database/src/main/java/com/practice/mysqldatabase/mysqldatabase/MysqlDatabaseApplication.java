package com.practice.mysqldatabase.mysqldatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.mysqldatabase.mysqldatabase.entity.Person;
import com.practice.mysqldatabase.mysqldatabase.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class MysqlDatabaseApplication implements CommandLineRunner {

private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MysqlDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("Inserting 10001 -> {}", repository.save(new Person("Dron", "Moskaw", new Date())));
//		logger.info("Inserting 10002 -> {}", repository.save(new Person("Jack", "London", new Date())));
//		logger.info("Inserting 10003 -> {}", repository.save(new Person("Shake", "New Delli", new Date())));
		
		//logger.info("Updating 10003 -> {}", repository.save(new Person(15, "Owa", "Banckok", new Date())));

		logger.info("User od 10001 - > {}", repository.findById(15));
		//repository.deleteById(16);

		logger.info("All users -> {}",repository.findAll());
		
	}

	

}
