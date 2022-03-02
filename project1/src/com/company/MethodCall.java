package com.company;
/*Написать функцию, которая возвращает минимум из двух чисел.*/
/*Написать функцию, которая вычисляет максимум из двух чисел.*/
/*Написать функцию, которая вычисляет минимум из трёх чисел.*/
/*Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)*/
public class MethodCall
{
    public static void main(String[] args)
    {
        int a = 10, b = 7, c = 12, d = 8;
        int min1 = min(a, b);
        int max2 = max2(a, b);
        int min3 = min3(a, b, c);
        int min4 = min4(a, b, c, d);

        System.out.println("Minimum is "+ min1);
        System.out.println("Maximum2 is "+ max2);
        System.out.println("Minimum3 is "+ min3);
        System.out.println("Minimum4 is "+ min4);
    }

    public static int min(int c, int d)
    {
        int m2;
        if (c < d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }

    public static int max2(int c, int d)
    {
        int m2;
        if (c > d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }

    public static int min3(int c, int d, int e)
    {
        int m2;
        if (c < d && c < e) {
            m2 = c;
        } else if (d < c && d < e) {
            m2 = d;
        } else {
            m2 =  e;
                }

        return m2;
    }

    public static int min4(int c, int d, int e, int f)
    {

        if (min(c,d) < min(e,f))
            return min(c,d);
        else
            return min(e,f);

    }


}