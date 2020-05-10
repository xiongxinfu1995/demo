package com.seecen.homdwork.abstractFactory1;

/*生产整套产品的抽象工厂*/
public abstract class AbstractFactory {
    /*传入或要获取的形状的名称*/
    public abstract IShape getShape(String shapeName);
    /*传入或要获取的颜色的名称*/
    public abstract IColor getColor(String colorName);
}
