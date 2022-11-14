package com.example.myapplication.Model;

public class Person {
    private String name;
    private boolean isMale;

    public Person(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
