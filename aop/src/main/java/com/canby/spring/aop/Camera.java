package com.canby.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by acanby on 31/05/2015.
 */
@Component
public class Camera {

    public void snap() {
        System.out.println("SNAP");
    }
}
