package com.corey.product;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class ConcreteBuilder1 extends Builder {


    @Override
    public void ConcreteBuilderA() {
        super.getProduct().add("部分A");
    }
    @Override
    public void ConcreteBuilderB() {
        super.getProduct().add("部分B");
    }

}
