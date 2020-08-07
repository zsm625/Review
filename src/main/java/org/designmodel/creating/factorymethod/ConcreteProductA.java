package org.designmodel.creating.factorymethod;

/**
 * 具体产品 实现Product
 */
public class ConcreteProductA implements Product{
    @Override
    public void use() {
        System.out.println("产品A");
    }
}
