package com.spring.database.databasedemo.entity;

import java.util.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
//import javax.persistence.Table;

@Entity
//@Table(name = "person")		//Because the table name matches with the name of the class, this annotation isn't wanted
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	//@Column(name = "name")	//Because this is match... this annotation is not wanted
	private String name;
	private String location;
	private Date birthDate;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	
}
