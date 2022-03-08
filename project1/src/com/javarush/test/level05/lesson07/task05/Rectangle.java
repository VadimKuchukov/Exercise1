package com.javarush.test.level05.lesson07.task05;

public class Rectangle {
    private int top, left, width, height;

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle another){
        this.left = another.left;
        this.top = another.top;
        this.width = another.width;
        this.height = another.height;
    }
}
