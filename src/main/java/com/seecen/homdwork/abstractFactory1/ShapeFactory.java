package com.seecen.homdwork.abstractFactory1;

public class ShapeFactory extends AbstractFactory {
    public IShape getShape(String shapeName) {
        if ("circle".equalsIgnoreCase(shapeName)) return new Circle();
        if ("square".equalsIgnoreCase(shapeName)) return new Square();
        if ("rectangle".equalsIgnoreCase(shapeName)) return new Rectangle();
        throw new RuntimeException("要获取的形状不存在!");
    }

    public IColor getColor(String colorName) {
       return null;
    }
}
