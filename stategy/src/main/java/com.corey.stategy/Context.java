package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/19.
 */
public class Context {
    private CashSuper cashSuper;

    public Context(String type) {
        switch (type) {
            case "正常收费":
                this.cashSuper = new CashNormal();
                break;
            case "促销八折":
                this.cashSuper = new CashRebate(0.8);
                break;
            case "满三百返一百":
                this.cashSuper = new CashReturn(300, 100);
                break;
            default:
                this.cashSuper = new CashNormal();
        }

    }

    public double getResult(Double money){
        return cashSuper.acceptMoney(money);
    }
}
