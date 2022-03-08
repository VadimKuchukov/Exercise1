package com.javarush.test.level04.lesson02.task05;

public class Solution {
    public static void main(String[] args) {

        System.out.println("Cats count is " + Cat.count);
        Cat cat1 = new Cat();
        Cat.count++;
        System.out.println("Cats count is " + Cat.count);
        Cat cat2 = new Cat();
        Cat.count++;
        System.out.println("Cats count is " + Cat.count);
    }
    private static class Cat {
        public static int count = 0;

    }

}
