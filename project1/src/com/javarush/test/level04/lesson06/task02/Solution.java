package com.javarush.test.level04.lesson06.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());


        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > c && b > d)
            System.out.println(b);
        else if (c > d)
            System.out.println(c);
        else
            System.out.println(d);
    }
}
