package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for(int i = 1; i <=m; i++){
            for(int a = 1; a <= n; a++)
                System.out.print(8);
            System.out.println();
        }
    }
}
