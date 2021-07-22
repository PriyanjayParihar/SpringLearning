package org.example.BeanWithCollectionAndRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config3.xml");

        StudentAllCollectionAndRef s= (StudentAllCollectionAndRef) applicationContext.getBean("student1");
        System.out.println(s);
    }
}
