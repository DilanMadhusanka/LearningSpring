package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect					//Combination of point cut and advice
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	
	//@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")	//"point cut"
	@Before("com.in28minutes.spring.aop.springaop.aspect.CommanJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		//What to do?
		//Advice
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for - {}", joinPoint);
	}
}
