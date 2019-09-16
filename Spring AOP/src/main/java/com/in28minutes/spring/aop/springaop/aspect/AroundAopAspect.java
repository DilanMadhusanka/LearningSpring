package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect					//Combination of point cut and advice
@Configuration
public class AroundAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	
	//@Around("com.in28minutes.spring.aop.springaop.aspect.CommanJoinPointConfig.businessLayerExecution()")
	@Around("com.in28minutes.spring.aop.springaop.aspect.CommanJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		
		//Start time = x
		//allow execution of method
		//end time = y
		
		logger.info("Time taken by {} is {}", joinPoint, timeTaken);
	}
}
