package org.designmodel.creating.builder;

/**
 * 建造者模式：
 *   建造者：定义产品建造的表示
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public abstract Product getResult();
}
