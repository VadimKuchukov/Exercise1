package com.company;

/*Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.*/

/*Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.*/

public class meth
{
    public static void main(String[] args)
    {
        print3("Hello, world)");
        print1("Bom");

    }

    public static void print3(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    public static void print1(String s)
    {
        System.out.print(s + " "+ s + " "+ s);

    }
}
