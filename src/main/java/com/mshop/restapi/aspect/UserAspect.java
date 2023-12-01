package com.mshop.restapi.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {
	
//	@Before(value="execution(* com.mshop.restapi.controller.*.*(..))")
//   public void beforeAdvice()
//   {
//	   System.out.println("Hello World");
//   }
	@Before(value="execution(* com.mshop.restapi.controller.usercontroller.getUser(..))")
	   public void beforeAdvice(JoinPoint joinpoint)
	   {
		   System.out.println(joinpoint.getSignature()+"Hello Sky "+new Date());
	   }
	@After(value="execution(* com.mshop.restapi.controller.usercontroller.getUser(..))")
	public void afterAdvice(JoinPoint joinpoint)
	{
		 System.out.println(joinpoint.getSignature()+"After Advice Called "+new Date());
	}
 }
