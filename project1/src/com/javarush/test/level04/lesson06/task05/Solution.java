package com.javarush.test.level04.lesson06.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age<18)
            System.out.println("Подрасти еще");
        else if (age>18)
            System.out.println("И 18-ти достаточно");
    }
}
