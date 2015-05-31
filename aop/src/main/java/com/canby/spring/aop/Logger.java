package com.canby.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by acanby on 31/05/2015.
 */
@Component
@Aspect
public class Logger {

    @Pointcut("execution(* com.canby.spring.aop.camera.Camera.*(..))")
    private void allSnaps() {}

    @Before("allSnaps()")
    public void beforeAdvice() {
        System.out.println("Before advice...");
    }

    @After("allSnaps()")
    public void afterAdvice() {
        System.out.println("After advice... ");
    }

    @AfterReturning("allSnaps()")
    public void afterReturningAdvice() {
        System.out.println("After returning advice... ");
    }

    @AfterThrowing("allSnaps()")
    public void afterThrowingAdvice() {
        System.out.println("After throwing advice... ");
    }

    @Around("allSnaps()")
    public void aroundAdvice(ProceedingJoinPoint p) {
        System.out.println("Around advice (before)... ");
        try {
            p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Around advice (after)... ");
    }
}
