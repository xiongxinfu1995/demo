package com.seecen.homdwork.abstractFactory1;

public interface IShape {
    void draw();
}
class Circle implements IShape {
    public void draw() {
        System.out.println("draw circle圆形...");
    }
}
class Square implements IShape {
    public void draw() {
        System.out.println("draw square方形...");
    }
}
class Rectangle implements IShape {
    public void draw() {
        System.out.println("draw rectangle矩形...");
    }
}
