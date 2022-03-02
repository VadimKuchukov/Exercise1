package com.javarush.test.level03.lesson08.task02;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String money = reader.readLine();
        String time = reader.readLine();
        System.out.println(name + " получает " + money + " через " + time + " лет.");

    }
}