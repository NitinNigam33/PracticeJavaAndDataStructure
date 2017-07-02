package com.DependencyInjectionWithFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIWithFactoryMethod {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Printable p = (Printable) context.getBean("callP");
        p.print();
    }
}