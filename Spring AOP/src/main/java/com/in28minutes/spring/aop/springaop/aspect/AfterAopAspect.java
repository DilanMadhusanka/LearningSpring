package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect					//Combination of point cut and advice
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	
	//@AfterReturning(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))", returning = "result")	//"point cut"
	@AfterReturning(value = "com.in28minutes.spring.aop.springaop.aspect.CommanJoinPointConfig.businessLayerExecution()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		//What to do?
		//Advice
		logger.info("{} retunred with value {}", joinPoint, result);
	}
	
	@AfterThrowing(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception) {
		//What to do?
		//Advice
		logger.info("{} throw exception {}", joinPoint, exception);
	}
	
	//@After(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	@After(value = "com.in28minutes.spring.aop.springaop.aspect.CommanJoinPointConfig.businessLayerExecution()")
	public void afterThrowing(JoinPoint joinPoint) {
		//What to do?
		//Advice
		logger.info("after execution of {}", joinPoint);
	}
}
