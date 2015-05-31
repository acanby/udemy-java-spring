package com.canby.spring.aop;

import com.canby.spring.aop.camera.Camera;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acanby on 31/05/2015.
 */
public class App {

    public static void main(String[] args) throws Exception {
        try (ClassPathXmlApplicationContext context =
                        new ClassPathXmlApplicationContext("beans.xml")) {

            Camera camera = (Camera) context.getBean("camera");
            camera.snap();
        }
    }
}
