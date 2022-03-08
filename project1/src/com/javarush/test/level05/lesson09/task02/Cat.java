package com.javarush.test.level05.lesson09.task02;

public class Cat {
    private String name = null;
    private int age = 6;
    private int weight = 5;
    private String color;
    private String address = null;

    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


}
