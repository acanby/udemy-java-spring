package com.canby.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by acanby on 31/05/2015.
 */
@Component
@Aspect
public class Logger {

    @Before("execution(void com.canby.spring.aop.Camera.snap())")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo...");
    }
}
