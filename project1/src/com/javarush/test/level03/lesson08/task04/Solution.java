package com.javarush.test.level03.lesson08.task04;
/*Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");

    }
}