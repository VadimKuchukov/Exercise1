package com.company;

public class Main {

    public static void main(String[] args) {
        /* Объявите переменные name1, name2, name3 типа String.
        Сразу же в строке объявления присвойте им какие-нибудь значения.
        Значениями могут быть любые строки.
         */
        String name1 = "Alex";
        String name2 = "Nick";
        String name3 = "Eric";

        /* Напиши программу, которая выводит на экран надпись:
        «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.
         */
        String text = "Когда я вырасту, то хочу быть паровым экскаватором";
        for (int i = 0; i < 10; i++) {
            System.out.println(text);
        }

        /* Раскоментируйте часть кода, чтобы на экран вывелось сообщение "Happy New Year"
         */
        //System.out.println("Happy New Year");
        //System.out.println("Happy New Year");
        System.out.println("Happy New Year");
        //System.out.println("Happy New Year");

        /* Внесите изменения в программу, чтобы переменная s была равна 5,
        t была равна 6, а x равна 7. Программа должна компилироваться.
         */
        byte s;
        byte t;
        byte x;
        s = 5; t = 6; x = 7;

        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("x = " + x);

        
    }
}
