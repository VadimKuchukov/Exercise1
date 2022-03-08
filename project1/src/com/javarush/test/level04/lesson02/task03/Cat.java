package com.javarush.test.level04.lesson02.task03;

class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
        return;
    }

        public static void main (String [] args) {

        Cat.setCatsCount(10);
        System.out.println(catsCount);

        }
}
