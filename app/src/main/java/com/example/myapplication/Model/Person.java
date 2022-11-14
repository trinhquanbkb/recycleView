package com.example.myapplication.Model;

public class Person {
    private String name;
    private boolean isMale;
    private int image;

    public Person(String name, boolean isMale, int image) {
        this.name = name;
        this.isMale = isMale;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
