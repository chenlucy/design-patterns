package com.corey.product;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class TestMain {
    public static void main(String[] args) {
        Director director = new Director();//指挥者
        Builder builder1 = new ConcreteBuilder1();//建造者
        director.construct(builder1); //指挥者 命令 建造者 建造
        Product product1 = builder1.getProduct(); //建造者完成产品
        product1.show();//产品验收

        Builder builder2 = new ConcreteBuilder2();//建造者
        director.construct(builder2); //指挥者 命令 建造者 建造
        Product product2 = builder2.getProduct(); //建造者完成产品
        product2.show();//产品验收
    }
}
