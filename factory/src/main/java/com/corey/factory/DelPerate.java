package com.corey.factory;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class DelPerate extends Operate{
    @Override
    public Double getResult() {
        if(this.getNumB().intValue()==0) {
            throw new IllegalArgumentException("除数不能为0！");
        }
        return this.getNumA()/this.getNumB();
    }
}
