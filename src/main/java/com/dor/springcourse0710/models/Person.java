package com.dor.springcourse0710.models;

public class Person {
    private int id;
    private String name;

    public Person(){}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
