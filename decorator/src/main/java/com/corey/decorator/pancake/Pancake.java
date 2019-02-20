package com.corey.decorator.pancake;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public abstract class Pancake {
    private String desc="我不是一个具体的煎饼";
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public abstract Double price();
}
