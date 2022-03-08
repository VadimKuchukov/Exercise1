package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for(int i = 0; i < 10; i++)
            System.out.println(name + " любит меня.");
    }
}
