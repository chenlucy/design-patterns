package com.corey.product;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class Director {
   public void construct(Builder builder){
       builder.ConcreteBuilderA();
       builder.ConcreteBuilderB();

   }
}
