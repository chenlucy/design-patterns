package com.corey.person;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public interface IBuilder {

    void setBody();

    void setHead();

    void setFoot();

    void setHand();

    Person getPerson();
}
