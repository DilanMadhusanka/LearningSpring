package com.spring.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
