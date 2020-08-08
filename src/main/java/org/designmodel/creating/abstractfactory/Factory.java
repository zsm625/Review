package org.designmodel.creating.abstractfactory;

/**
 * 具体工厂
 */
public class Factory extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

    /**
     * testFactory
     * @param args
     */
    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        //产品A
        productA.eat();
        productA.use();
        //产品B
        productB.put();
    }
}
