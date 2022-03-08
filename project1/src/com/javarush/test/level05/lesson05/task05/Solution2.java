package com.javarush.test.level05.lesson05.task05;


import com.javarush.test.level05.lesson05.task02.Cat;

public class Solution2 {

    public static void main(String[] args){
        Cat cat1 = new Cat("Vasya", 5, 7, 10);
        Cat cat2 = new Cat("Grisha", 2, 7, 11);
        Cat cat3 = new Cat("Barsik", 5, 5, 14);


        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }
}
