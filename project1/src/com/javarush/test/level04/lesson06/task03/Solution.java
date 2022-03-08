package com.javarush.test.level04.lesson06.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a>b && a>c) {
            System.out.print(a);
            if (b > c)
                System.out.println(" " + b + " " + c);
            else if (b < c)
                    System.out.println(" " + c + " " + b);
        }
        else if (b>a && b>c) {
            System.out.print(b);
            if (a > c)
                System.out.println(" " + a + " " + c);
            else if (a < c)
                System.out.println(" " + c + " " + a);
        }
        else if (c>a && c>b) {
            System.out.print(c);
            if (a > b)
                System.out.println(" " + a + " " + b);
            else if (a < b)
                System.out.println(" " + b + " " + a);
        }


    }
}
