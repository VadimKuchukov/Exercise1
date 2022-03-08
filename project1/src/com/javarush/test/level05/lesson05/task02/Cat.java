package com.javarush.test.level05.lesson05.task02;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat){
        if (this.weight > anotherCat.weight)
            return true;
        else
            return false;
    }
}


