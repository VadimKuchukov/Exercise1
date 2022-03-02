package com.javarush.test.level03.lesson12.task03;

/*Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();


        System.out.println("Я буду зарабатывать " + n + " $ в час.");

    }
}
