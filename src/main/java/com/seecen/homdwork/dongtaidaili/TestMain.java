package com.seecen.homdwork.dongtaidaili;

public class TestMain {

    public static void main(String[] args) throws Exception {

        BaseService mike= ProxyFactory.Builder(Person.class);
        mike.eat();
    }

}
