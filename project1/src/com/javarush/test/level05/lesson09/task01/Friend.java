package com.javarush.test.level05.lesson09.task01;

public class Friend {
    private String name;
    private int age;
    private int gender;

    public Friend(String name){
        this.name = name;
    }

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, int gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
