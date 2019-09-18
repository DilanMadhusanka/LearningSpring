package com.spring.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.database.databasedemo.entity.Person;

@Repository		// Become a Repository
@Transactional		//View to transaction management
public class PersonJpaRepository {

	@PersistenceContext						//Connect to the database
	EntityManager entityManager;
	
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);	//use jpql
		return namedQuery.getResultList();
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);	//JPA
		//entityManager.find(entityClass, primaryKey);
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);	//JPA
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);	//JPA
	}
	
	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);	//JPA
	}
}
