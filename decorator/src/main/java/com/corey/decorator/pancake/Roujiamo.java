package com.corey.decorator.pancake;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class Roujiamo extends Pancake{

    public Roujiamo(){
        super.setDesc("肉夹馍");
    }
    @Override
    public Double price(){
        return 2d;
    }
}
