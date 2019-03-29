package com.corey.proxy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/20.
 */
public class TestMain {
    public static void main(String[] args) {
//        System.out.println("================================");
//        Secretary secretary = new Secretary();
//        Colleague c1=new Colleague("黄同事",secretary);
//        Observer c2=new Observer("赵同事",secretary);
//        secretary.add(c1);
//        secretary.add(c2);
//        secretary.setActive("老板来了@！");
//        secretary.notified();


        Subject boss = new Secretary();
        Colleague c1=new Colleague("黄同事",boss);
        Observer c2=new Observer("赵同事",boss);
        boss.add(c1);
        boss.add(c2);
        boss.setActive("老板来了@！");
        boss.notified();


    }
}
