package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        int m=0;

        while (m < n) {
            System.out.println(line);
            m++;
        }
    }
}
