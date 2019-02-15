package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class CountFactory {
    private static Operate operate=null;
    public static Operate getInstance(String oper){
        switch (oper){
            case "+":
                operate=new AddOperate();
                break;
            case "-":
                operate=new AddOperate();
                break;
            case "*":
                operate=new AddOperate();
                break;
            case "/":
                operate=new AddOperate();
                break;
        }
        return operate;
    }
}
