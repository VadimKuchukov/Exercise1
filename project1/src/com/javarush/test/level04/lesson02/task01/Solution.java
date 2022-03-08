package com.javarush.test.level04.lesson02.task01;

class Cat
{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main (String [] args) {
        Cat vasya = new Cat();
        vasya.name = "Vasiliy";
        System.out.println(vasya.name);
    }
}