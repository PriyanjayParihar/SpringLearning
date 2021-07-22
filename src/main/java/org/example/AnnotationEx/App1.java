package org.example.AnnotationEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AnnoConfig.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
    }
}
