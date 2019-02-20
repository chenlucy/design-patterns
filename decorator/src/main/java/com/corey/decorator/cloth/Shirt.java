package com.corey.decorator.cloth;

import com.corey.decorator.Clothing;
import com.corey.decorator.Person;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class Shirt extends Clothing {

    @Override
    public void show(){
        System.out.println("衬衣");
        super.show();
    }
}
