package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/16.
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptMoney(double money) {
        return money;
    }
}
