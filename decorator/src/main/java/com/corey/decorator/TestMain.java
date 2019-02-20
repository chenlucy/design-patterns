package com.corey.decorator;

import com.corey.decorator.Clothing;
import com.corey.decorator.Person;
import com.corey.decorator.cloth.Shirt;
import com.corey.decorator.cloth.Trousers;
import com.corey.decorator.cloth.Tshirt;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("小明");
        System.out.println("第一种装扮：");

        Tshirt tshirt=new Tshirt();
        Shirt shirt = new Shirt();
        Trousers trousers = new Trousers();
        tshirt.decorator(person);
        shirt.decorator(tshirt);
        trousers.decorator(shirt);

        trousers.show();
    }
}
