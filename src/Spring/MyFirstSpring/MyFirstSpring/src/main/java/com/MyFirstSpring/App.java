package com.MyFirstSpring;

/**
 * Hello world!
 *
 */
/*
 * public class App { public static void main( String[] args ) {
 * System.out.println( "Hello World!" ); } }
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();
    }
}