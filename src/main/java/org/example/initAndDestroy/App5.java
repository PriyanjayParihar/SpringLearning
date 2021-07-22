package org.example.initAndDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config5.xml");
        System.out.println( "Hello World!" );
        Student5 student1=(Student5) applicationContext.getBean("student1");
        System.out.println(student1);
        Student5 student2=(Student5) applicationContext.getBean("student2");
        System.out.println(student2);
    }
}
