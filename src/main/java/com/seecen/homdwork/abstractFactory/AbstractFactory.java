package com.seecen.homdwork.abstractFactory;

public interface AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
