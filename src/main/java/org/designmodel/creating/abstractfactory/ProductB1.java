package org.designmodel.creating.abstractfactory;

/**
 * 具体产品B
 */
public class ProductB1 extends AbstractProductB{
    @Override
    public void put() {
        System.out.println("productB should be put in box");
    }
}
