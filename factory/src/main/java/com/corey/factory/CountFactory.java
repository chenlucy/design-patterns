package com.corey.factory;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class CountFactory {
    private static Operate operate;

    public static Operate getInstance(String oper) {
        switch (oper) {
            case "+":
                operate = new AddOperate();
                break;
            case "-":
                operate = new SubOperate();
                break;
            case "*":
                operate = new ChengOperate();
                break;
            case "/":
                operate = new DelPerate();
                break;
            default:
                throw new IllegalArgumentException("输入参数有误!");
        }
        return operate;
    }
}
