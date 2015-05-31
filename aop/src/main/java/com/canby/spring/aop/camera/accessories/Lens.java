package com.canby.spring.aop.camera.accessories;

import org.springframework.stereotype.Component;

/**
 * Created by acanby on 31/05/2015.
 */
@Component
public class Lens {
    public void zoom(int factor) {
        System.out.println("Zooming lens with factor: " + factor);
    }
}
