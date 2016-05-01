package com.home.aop;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SecurityAspect {

	private Authenticator authenticator = new Authenticator();
	
	pointcut secureAccess()
	
}
