package com.epam.lab;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Собака " + name;
    }
}
