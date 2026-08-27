package com.example.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.service.*.*(..))")
    public void beforeAdvice(JoinPoint jp) {
        System.out.println("🔹 [Before] Method: " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.service.*.*(..))")
    public void afterReturningAdvice(JoinPoint jp) {
        System.out.println("[After Returning] Method: " + jp.getSignature().getName());
    }

    @AfterThrowing(pointcut = "execution(* com.example.service.*.*(..))", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint jp, Exception ex) {
        System.out.println(" [After Throwing] Exception in method: " + jp.getSignature().getName() + " | Message: " + ex.getMessage());
    }

    @After("execution(* com.example.service.*.*(..))")
    public void afterAdvice(JoinPoint jp) {
        System.out.println(" [After] Method finished: " + jp.getSignature().getName());
    }
}
