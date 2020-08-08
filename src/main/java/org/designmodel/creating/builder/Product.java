package org.designmodel.creating.builder;

/**
 * 产品
 */
public class Product {
    private String name;
    private String body;
    private String head;
    private String leg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", head='" + head + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
