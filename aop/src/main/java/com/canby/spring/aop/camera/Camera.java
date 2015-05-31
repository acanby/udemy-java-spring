package com.canby.spring.aop.camera;

import org.springframework.stereotype.Component;

/**
 * Created by acanby on 31/05/2015.
 */
@Component
public class Camera {

    public void snap() throws Exception {
        System.out.println("SNAP");
//        throw new Exception("Damn");
    }

    public void snap(int exposure) {
        System.out.println("SNAP. Exposure: " + exposure);
    }

    public String snap(String name) {
        System.out.println("SNAP. Name: " + name);
        return name;
    }

    public void snapNightMode() {
        System.out.println("SNAP. Nightmode!");
    }
}
