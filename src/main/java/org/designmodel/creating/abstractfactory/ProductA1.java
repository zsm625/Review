package org.designmodel.creating.abstractfactory;

/**
 * 具体产品A
 */
public class ProductA1 extends AbstractProductA{
    @Override
    public void use() {
        System.out.println("productA be used");
    }

    @Override
    public void eat() {
        System.out.println("product can be eat");
    }
}
