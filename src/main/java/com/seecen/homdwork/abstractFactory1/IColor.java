package com.seecen.homdwork.abstractFactory1;

public interface IColor {
    void fill();
}
class Red implements IColor {
    public void fill() {
        System.out.println("fill red...红色");
    }
}
class Green implements IColor {
    public void fill() {
        System.out.println("fill green...绿色");
    }
}
class Blue implements IColor {
    public void fill() {
        System.out.println("fill blue...蓝色");
    }
}
