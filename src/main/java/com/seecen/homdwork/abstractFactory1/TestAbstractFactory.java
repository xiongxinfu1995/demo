package com.seecen.homdwork.abstractFactory1;

/**
 * 红色 圆心
 * 蓝色 方形
 * 绿色 矩形
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory shapeFacory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFacory = FactoryProducer.getFactory("color");

       /* IColor color = colorFacory.getColor("blue");
        IShape shape = shapeFacory.getShape("square");
        shape.draw();
        color.fill();*/

        IColor red = colorFacory.getColor("red");
        IShape cricle = shapeFacory.getShape("circle");
        cricle.draw();
        red.fill();

        /*IColor green = colorFacory.getColor("green");
        IShape rectangle = shapeFacory.getShape("rectangle");
        rectangle.draw();
        green.fill();*/

    }
}
