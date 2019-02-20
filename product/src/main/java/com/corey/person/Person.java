package com.corey.person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class Person implements Serializable {
    private String body;
    private String head;
    private String foot;
    private String hand;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Person{" +
                "body='" + body + '\'' +
                ", head='" + head + '\'' +
                ", foot='" + foot + '\'' +
                ", hand='" + hand + '\'' +
                '}';
    }
}
