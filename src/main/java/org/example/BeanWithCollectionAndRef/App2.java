package org.example.BeanWithCollectionAndRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config2.xml");
        System.out.println( "Hello World!" );
        StudentWithList student1=(StudentWithList) applicationContext.getBean("student1");
        System.out.println(student1);

    }
}
