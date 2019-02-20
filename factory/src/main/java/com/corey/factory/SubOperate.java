package com.corey.factory;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class SubOperate extends Operate{
    @Override
    public Double getResult(){
        return this.getNumA()-this.getNumB();
    }
}
