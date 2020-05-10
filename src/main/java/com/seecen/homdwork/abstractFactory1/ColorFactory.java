package com.seecen.homdwork.abstractFactory1;

public class ColorFactory extends AbstractFactory  {
    public IShape getShape(String shapeName) {
        return null;
    }
    public IColor getColor(String colorName) {
        if("red".equalsIgnoreCase(colorName)) return new Red();
        if("green".equalsIgnoreCase(colorName)) return new Green();
        if("blue".equalsIgnoreCase(colorName)) return new Blue();
        throw new RuntimeException("要获取的颜色不存在!");
    }
}
