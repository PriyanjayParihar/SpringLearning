package org.example.AutoWiring;

public class Student {
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }

    public Student() {
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }
}
