package com.seecen.homdwork.abstractFactory1;

/**
 * 工厂生成器,代表你要获取哪个工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName) {
        if("shape".equalsIgnoreCase(factoryName)) return new ShapeFactory();
        if("color".equalsIgnoreCase(factoryName)) return new ColorFactory();
        throw new RuntimeException("你要获取的工厂不存在...");
    }
}
