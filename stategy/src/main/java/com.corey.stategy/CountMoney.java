package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/16.
 */
public class CountMoney {
    private double price;
    private int count;
    private int type;

    public CountMoney(double price, int count,int type) {
        this.price = price;
        this.count = count;
        this.type = type;
    }

    public double getTotal(){
        double total = 0;
        switch (type){
            case 0:
                total = 0;
                break;
            case 1:
                total = price*count;
                break;
            case 2:
                total = price*count*0.85;
                break;
            case 3:
                total = price*count*0.75;
                break;
            case 4:
                total = price*count*0.5;
                break;
            default:
                total = price*count;
        }
        return total;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
