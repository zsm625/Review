package org.designmodel.creating.factorymethod;

import java.net.CacheRequest;

/**
 * 具体工厂操作生产产品
 */
public class ConcreteFactory implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
