package com.practice.mysqldatabase.mysqldatabase.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.mysqldatabase.mysqldatabase.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
