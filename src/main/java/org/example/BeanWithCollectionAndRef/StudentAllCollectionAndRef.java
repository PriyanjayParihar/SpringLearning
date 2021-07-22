package org.example.BeanWithCollectionAndRef;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentAllCollectionAndRef {
    private String name;
    private List phones;
    private Set cities;
    private Map<String,String> courses;
    private Marks marks;

    @Override
    public String toString() {
        return "StudentAllCollectionAndRef{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", cities=" + cities +
                ", courses=" + courses +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        System.out.println("getter run");
        return name;
    }

    public void setName(String name) {
        System.out.println("setter run");
        this.name = name;
    }

    public List getPhones() {
        return phones;
    }

    public void setPhones(List phones) {
        this.phones = phones;
    }

    public Set getCities() {
        return cities;
    }

    public void setCities(Set cities) {
        this.cities = cities;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public StudentAllCollectionAndRef() {

    }

    public StudentAllCollectionAndRef(String name, List phones, Set cities, Map<String, String> courses, Marks marks) {
        System.out.println("pconstructor run");
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.courses = courses;
        this.marks = marks;
    }
}
