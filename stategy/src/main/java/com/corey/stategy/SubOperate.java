package com.corey.stategy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class SubOperate extends Operate{
    public Double getResult(){
        return  super.getNumA()-super.getNumB();
    }
}
