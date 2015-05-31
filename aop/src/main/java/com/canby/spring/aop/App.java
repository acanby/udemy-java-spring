package com.canby.spring.aop;

import com.canby.spring.aop.camera.Camera;
import com.canby.spring.aop.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acanby on 31/05/2015.
 */
public class App {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                        new ClassPathXmlApplicationContext("beans.xml")) {

            Camera camera = (Camera) context.getBean("camera");
            Lens lens = (Lens) context.getBean("lens");

            camera.snap();
            camera.snap(1000);
            camera.snap("Wollongong Harbour");
            camera.snapNightMode();

            lens.zoom(100);
        }
    }
}
