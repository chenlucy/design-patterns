package com.corey.stategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/16.
 */
public class TestMain {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择活动类型：");
        System.out.println("1 无活动");
        System.out.println("2 全场8折");
        System.out.println("3 满300返100");
        int type = scanner.nextInt();
        double price = 0;
        int count = 0;
        double amount = 0;
        double total = 0;
        int i = 0; //商品序号
        while (true) {
            amount = price * count;
            total += amount;
            list.add("商品 " + i + " 的价格：" + price + " 元,数量：" + count + ",合计：" + amount + " 元。");
            i++;
            print(list, total);
            System.out.println("请输入单价：");
            price = scanner.nextDouble();
            if(price<0){
                break;
            }
            System.out.println("请输入数量：");
            count = scanner.nextInt();

        }
//        CashSuper cashSuper = CashFactory.getStance(type);
//        total = cashSuper.acceptMoney(total);
        Context context = new Context(ActiveType.正常收费.toString());
        total=context.getResult(total);
        System.out.println("您的应付款金额是："+total);
        System.out.println("请付款：");
        double money = scanner.nextDouble();
        if(money==total){
            System.out.println("付款成功，购物愉快！");
        }else {
            System.out.println("付款失败，请联系管理员！");
        }


    }


    public static void print(List<String> list, double total) {
        if (list.size() == 1) {
            System.out.println("系统初始化....");
            System.out.println();
            try {
                Thread.sleep(5000L);
            } catch (Exception e) {

            }
            System.out.println("系统初始化完成");
        }
        System.out.println("******************************************");
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------------------");
        System.out.println("商品金额总计: " + total + " 元。");
        System.out.println("******************************************");
    }
}
