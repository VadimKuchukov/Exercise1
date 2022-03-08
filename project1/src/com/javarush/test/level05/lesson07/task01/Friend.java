package com.javarush.test.level05.lesson07.task01;

public class Friend {
    private String name;
    private int age;
    private int gender;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, int gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
