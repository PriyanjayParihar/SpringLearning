package org.example.BeanWithCollectionAndRef;

import java.util.List;

public class StudentWithList {
    private int id;
    private List<Integer> marks;

    @Override
    public String toString() {
        return "StudentWithList{" +
                "id=" + id +
                ", marks=" + marks +
                '}';
    }

    public StudentWithList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public StudentWithList(int id, List<Integer> marks) {
        this.id = id;
        this.marks = marks;
    }
}
