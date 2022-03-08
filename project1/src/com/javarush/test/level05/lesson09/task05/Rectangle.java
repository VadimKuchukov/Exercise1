package com.javarush.test.level05.lesson09.task05;

public class Rectangle {
    private int top, left, width, height;

    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle another){
        this.left = another.left;
        this.top = another.top;
        this.width = another.width;
        this.height = another.height;
    }
}
