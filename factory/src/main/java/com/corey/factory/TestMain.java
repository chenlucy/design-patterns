package com.corey.factory;

import java.util.Scanner;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class TestMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入A:");
        String a = scanner.next();
        System.out.println("请输入符号:");
        String o = scanner.next();
        System.out.println("请输入B:");
        String b = scanner.next();
        Operate operate=CountFactory.getInstance(o);
        operate.setNumA(Double.valueOf(a));
        operate.setNumB(Double.valueOf(b));
        Double result = operate.getResult();
        System.out.println(result);

    }
}
