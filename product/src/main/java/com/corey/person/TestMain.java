package com.corey.person;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class TestMain {
    public static void main(String[] args) {
        Director director = new Director();//指挥者
        IBuilder builder = new SmartPerson();//建造者
         //指挥者 命令 建造者 建造,//建造者完成产品
        Person product = director.construct(builder);
        System.out.println(product);;//产品验收


    }
}
