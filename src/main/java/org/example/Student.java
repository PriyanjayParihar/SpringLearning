package org.example;

public class Student {
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    private int id;

    public Student() {
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
