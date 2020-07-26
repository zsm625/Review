package org.designmodel.proxy.dynamicproxy;

/**
 * 代理对象不需要实现接口，但是目标对象一定要实现接口，否则不能使用动态代理
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        IDog dog = new GunDog();
        IDog proxy =(IDog)MyProxyFactory.getProxy(dog);
        proxy.run();
    }

}
