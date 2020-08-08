package org.designmodel.creating.builder;

/**
 * 指挥者：指挥建造者生产产品
 */
public class Director {
    private Builder cbuild;
    public Director(Builder builder){
        this.cbuild = builder;
    }
    public Product construct(){
        cbuild.buildPartA();
        cbuild.buildPartB();
        cbuild.buildPartC();
        return cbuild.getResult();
    }

    public static void main(String[] args) {
        Builder cbuild = new ConcreteBuilder();
        Director director = new Director(cbuild);
        Product product = director.construct();
        System.out.println(product);
    }
}
