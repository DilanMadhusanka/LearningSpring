package com.in28minutes.spring.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)		//Only use methods. do not use classes
@Retention(RetentionPolicy.RUNTIME)		//able to have this information at runtime
public @interface TrackTime {

}
