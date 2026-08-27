package com.example.aspect;

import com.example.exception.CustomServiceException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GlobalExceptionAspect {

    // Apply to all methods in service and repository layers
    @Around("execution(* com.example.service..*(..)) || execution(* com.example.repository..*(..))")
    public Object handleGlobalException(ProceedingJoinPoint pjp) throws Throwable {
        try {
            System.out.println("Executing method1: " + pjp.getSignature());
            Object result = pjp.proceed();
            System.out.println("Completed method2: " + pjp.getSignature());
            return result;
        } catch (Exception ex) {
            // Global handling logic
            System.err.println("Exception in " + pjp.getSignature().toShortString());
            System.err.println("Message: " + ex.getMessage());

            // You can log, wrap, or rethrow a custom exception here
            throw new CustomServiceException("GlobalExceptionAspect caught1: " + ex.getMessage(), ex);
        }
    }
}