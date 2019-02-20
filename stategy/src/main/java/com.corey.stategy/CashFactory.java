package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/16.
 */
public class CashFactory {
    public static CashSuper getStance(int type) {
        CashSuper cashSuper;
        switch (type) {
            case 1:
                cashSuper = new CashNormal();
                break;
            case 2:
                cashSuper = new CashRebate(0.8);
                break;
            case 3:
                cashSuper = new CashReturn(300, 100);
                break;
            default:
                cashSuper = new CashNormal();
        }
        return cashSuper;
    }

}
