package com.corey.decorator.pancake;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class TestMain {
    public static void main(String[] args) {
        Pancake tornCake = new Tomcake();
        Pancake roujiamo=new Roujiamo();
        FireEgg fireEgg=new FireEgg(roujiamo);
        Ham ham=new Ham(fireEgg);
        System.out.println(ham.getDesc());
        System.out.println(ham.price());

    }
}
