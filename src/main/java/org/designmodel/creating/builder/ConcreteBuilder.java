package org.designmodel.creating.builder;

/**
 * 具体的建造者
 */
public class ConcreteBuilder extends Builder{
    private Product product;
    public ConcreteBuilder(){
        this.product = new Product();
    }
    @Override
    public void buildPartA() {
        System.out.println("build product name");
        product.setName("宝马");
    }

    @Override
    public void buildPartB() {
        System.out.println("build product head and body");
        product.setHead("墨绿色");
        product.setBody("车身");

    }

    @Override
    public void buildPartC() {
        System.out.println("build product leg");
        product.setLeg("四轮");
    }

    @Override
    public Product getResult() {
        System.out.println("get a product");
        return product;
    }
}
