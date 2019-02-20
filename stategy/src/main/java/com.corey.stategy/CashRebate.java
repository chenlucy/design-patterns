package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/16.
 */
public class CashRebate extends CashSuper {
    private double moneyRate=1;
    public CashRebate (double moneyRate){
        this.moneyRate=moneyRate;
    }
    @Override
    public double acceptMoney(double money) {
        return money*moneyRate;
    }
}
