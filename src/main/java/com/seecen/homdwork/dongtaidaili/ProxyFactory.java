package com.seecen.homdwork.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static BaseService Builder(Class classFile) throws Exception {

        //1.创建被监控实例对象
        BaseService obj = (BaseService) classFile.newInstance();
        //2.创建一个通知对象 用接口来描述
        InvocationHandler adviser = new Invocation(obj);
        //3.向JVM申请负责监控obj对象指定行为的监控对象（代理对象）
        /*
         *  loader:被监控对象隶属的类文件在内存中真实地址
         *  interfaces:被监控对象隶属的类文件实现接口
         *  h：监控对象发现小明要执行被监控行为，应该有哪一个通知对象进行辅助
         */
        BaseService $proxy = (BaseService) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                adviser);
        return $proxy;
    }

}
