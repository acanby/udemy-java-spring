package com.canby.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acanby on 31/05/2015.
 */
public class App {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                        new ClassPathXmlApplicationContext("beans.xml")) {

            Camera camera = (Camera) context.getBean("camera");
            camera.snap();
        }
    }
}
