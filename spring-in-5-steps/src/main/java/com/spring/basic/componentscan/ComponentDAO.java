package com.spring.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository		//This use instead @Component because DAO class is get the info from database
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
