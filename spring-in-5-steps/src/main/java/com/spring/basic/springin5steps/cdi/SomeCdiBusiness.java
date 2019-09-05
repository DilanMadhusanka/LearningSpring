package com.spring.basic.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	
}
	