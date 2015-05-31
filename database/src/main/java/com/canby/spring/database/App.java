package com.canby.spring.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        OfferDAO offersDao = (OfferDAO) applicationContext.getBean("offersDao");

        System.out.println(offersDao.getOffers());

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
