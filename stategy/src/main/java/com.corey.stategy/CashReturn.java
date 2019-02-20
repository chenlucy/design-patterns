package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/16.
 */
public class CashReturn extends CashSuper {
    private double conditionMoney;
    private double returnMoney;

    public CashReturn(double conditionMoney, double returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptMoney(double money) {
        if(money>=conditionMoney){
            money=money-Math.floor(money/conditionMoney)*returnMoney;
        }
        return money;
    }
}
