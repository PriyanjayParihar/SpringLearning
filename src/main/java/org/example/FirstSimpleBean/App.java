package org.example.FirstSimpleBean;

import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        System.out.println( "Hello World!" );
        Student student1=(Student) applicationContext.getBean("student1");
        System.out.println(student1);
        Student student2=(Student) applicationContext.getBean("student2");
        System.out.println(student2);
    }
}
