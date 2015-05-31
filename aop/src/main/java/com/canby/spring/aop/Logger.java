package com.canby.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by acanby on 31/05/2015.
 */
@Component
@Aspect
public class Logger {

    @Pointcut("execution(* com.canby.spring.aop.camera.Camera.*(..))")
    private void allSnaps() {}

    @Pointcut("execution(* com.canby.spring.aop.camera.Camera.snap(String))")
    private void snapsWithStrings() {}

    @Pointcut("execution(* com.canby.spring.aop.camera.accessories.*.*(..))")
    private void accessories() {}

    @Before("allSnaps()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }

    @Before("snapsWithStrings()")
    public void aboutToTakePhotoWithName() {
        System.out.println("About to take photo with name...");
    }

    @After("snapsWithStrings()")
    public void afterTakePhotoWithName() {
        System.out.println("After taking a photo with name...");
    }

    @Before("accessories()")
    public void aopRelatedAction() {
        System.out.println("Accessories related action");
    }
}
