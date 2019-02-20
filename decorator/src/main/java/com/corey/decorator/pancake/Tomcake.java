package com.corey.decorator.pancake;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class Tomcake extends Pancake{

    public Tomcake(){
        super.setDesc("手抓饼");
    }
    @Override
    public Double price(){
        return 4d;
    }
}
