package com.javarush.test.level04.lesson02.task02;

public class Cat {
    private static int catsCount = 0;
    public static void addNewCat()
    {
        Cat.catsCount++;
    }
    public static void main (String [] args) {
        new Cat();
        Cat.addNewCat();
        System.out.println(catsCount);
        Cat cat2 = new Cat();
        Cat.addNewCat();
        System.out.println(catsCount);

    }
}
