package com.corey.product;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public abstract class Builder {
    private Product product = new Product();
    public abstract void ConcreteBuilderA();
    public abstract void ConcreteBuilderB();
    public Product getProduct() {
        return product;
    }
}
