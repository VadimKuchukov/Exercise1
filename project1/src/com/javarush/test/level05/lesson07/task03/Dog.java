package com.javarush.test.level05.lesson07.task03;

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
