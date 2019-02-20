package com.corey.decorator;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class Clothing extends Person{
    private Person person;

    //装饰方法
    public void decorator(Person person){
        this.person=person;
    }

    @Override
    public void show(){
        if(person!=null){
            person.show();
        }
    }
}
