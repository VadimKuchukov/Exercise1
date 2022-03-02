package com.company;

public class Main {

    public static void main(String[] args) {
        //level 1

        /* Объявите переменные name1, name2, name3 типа String.
        Сразу же в строке объявления присвойте им какие-нибудь значения.
        Значениями могут быть любые строки.*/

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

        /*Задание: вывести на экран текст*/

        System.out.println("Меня зовут Амиго.\n" +
                        "\n" +
                        "Я согласен на зарплату $10/месяц в первый год.\n" +
                        "Я согласен на зарплату $20/месяц во второй год.\n" +
                        "Я согласен на зарплату $30/месяц в третий год.\n" +
                        "Я согласен на зарплату $40/месяц в четвертый год.\n" +
                        "Я согласен на зарплату $50/месяц в пятый год.\n" +
                        "\n" +
                        "Спасибо за щедрость, друг Риша!"
                );

        /*Новое задание: написать программу, которая выводит на экран строки:*/

        System.out.println("Меня зовут Амиго.\n" +
                "\n" +
                "Я согласен на зарплату $800/месяц в первый год.\n" +
                "Я согласен на зарплату $1500/месяц во второй год.\n" +
                "Я согласен на зарплату $2200/месяц в третий год.\n" +
                "Я согласен на зарплату $2700/месяц в четвертый год.\n" +
                "Я согласен на зарплату $3200/месяц в пятый год.\n" +
                "\n" +
                "Поцелуй мой блестящий металлический зад!"
        );

        //Переставьте строки так, чтобы получился текст "Nothing personal, it's just business."
        String a1 = "it's just business.";
        String a2 = "Nothing personal, ";
        System.out.println(a2+a1);

        //Объявите недостающие переменные и закоментарьте те, которые нигде не используются.

        int x1 = 1;
        int x2 = 2;
        //int x3 = 3;
        //int x4 = 4;
        int sum = x1+x2;
        System.out.println(sum);

        //Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.

        String text2 = "Слава Роботам! Убить всех человеков!";
        for (int i = 0; i < 16; i++) {
            System.out.println(text2);
        }

        //level 2
        /*Создать объект типа Cat 2 раза.*/

        Cat snowball = new Cat();
        Cat nutlet = new Cat();
        new Cat();
        new Cat();

        /*Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".*/

        Dog Max = new Dog();
        Dog Bella = new Dog();
        Dog Jack = new Dog();

        /*Напиши программу, которая выводит на экран надпись: «Мне так плохо! Хочу, чтобы все умерли!».*/

        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");

        /*Закоментарь несколько строк, чтобы на экран вывелось число 19*/

        int q = 10;
        //int w = 9;
        //int e = 8;
        int r = 9;
        System.out.println(q+r);

        /*Создайте 10 переменных типа Cat и 8 объектов типа Cat.*/

        Cat cat1;
        Cat cat2;
        Cat cat3;
        Cat cat4;
        Cat cat5;
        Cat cat6;
        Cat cat7;
        Cat cat8;
        Cat cat9;
        Cat cat10;

        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();

        /*Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).*/

        Cat cat = new Cat();
        cat.owner = new Person();
        cat.owner.name = "God";

        Dog dog = new Dog();
        dog.owner = new Person();
        dog.owner.name = "Dog";

        Fish fish = new Fish();
        fish.owner = new Person();
        fish.owner.name = "Me";

        Woman woman = new Woman();
        woman.owner = new Person();
        woman.owner.name = "Man";


    }
}






