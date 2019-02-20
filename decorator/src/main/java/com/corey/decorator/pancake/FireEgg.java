package com.corey.decorator.pancake;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class FireEgg extends Condiment {
    private Pancake pancake;
    public FireEgg(Pancake pancake){
        this.pancake=pancake;
    }
    @Override
    public String getDesc() {
        return pancake.getDesc()+"、煎蛋";
    }

    @Override
    public Double price() {
        return pancake.price()+2;
    }
}
