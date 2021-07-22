package org.example.initAndDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student5 implements InitializingBean, DisposableBean {
    public Student5(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    private int id;

    public Student5() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void init(){
        System.out.println("Init run");
    }
    public void destroy(){
        System.out.println("destroy run");
    }
    private String name;
    private String Address;
}
