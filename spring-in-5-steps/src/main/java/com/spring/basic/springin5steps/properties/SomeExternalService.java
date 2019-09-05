package com.spring.basic.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

	@Value("${external.service.url}")	//Without put the ${} not work
	//from property file
	private String url;
	
	public String returnServiceURL(){
		return url;
	}
}
