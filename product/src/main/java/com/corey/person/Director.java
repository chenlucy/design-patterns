package com.corey.person;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class Director {
    public Person construct(IBuilder builder) {
        builder.setBody();
        builder.setHead();
        builder.setFoot();
        builder.setHand();
        return builder.getPerson();
    }
}
