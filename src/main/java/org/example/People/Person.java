package org.example.People;

class Person {
    private String name;
    private String address;

    public Person() {
        name = "Oli";
        address = "Ida Albergintie Street 1 00400 Helsinki";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + "\n" + address;
    }
}
