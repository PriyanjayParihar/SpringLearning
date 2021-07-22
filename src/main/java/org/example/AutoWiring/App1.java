package org.example.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student);
    }
}
