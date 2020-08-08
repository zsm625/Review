package org.designmodel.creating.abstractfactory;

/**
 * 抽象工厂，定义创建不同产品的方法
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
