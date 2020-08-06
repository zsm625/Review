package org.designmodel.creating.simplefacatory;

/**
 * 简单工厂模式
 */
public class SimpleFactoryPattern {

    public static Button createProduct(String name){
        if(name=="圆"){
            return new CircleBtn();
        }
        else if(name == "三角"){
            return new TriangleBtn();
        }
        return null;
    }
}
