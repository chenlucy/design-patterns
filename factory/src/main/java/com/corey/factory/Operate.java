package com.corey.factory;

import java.io.Serializable;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/15.
 */
public class Operate implements Serializable {
    private Double numA=0D;
    private Double numB=0D;

    public Double getResult(){
        return 0d;
    }

    public Double getNumA() {
        return numA;
    }

    public void setNumA(Double numA) {
        this.numA = numA;
    }

    public Double getNumB() {
        return numB;
    }

    public void setNumB(Double numB) {
        this.numB = numB;
    }
}
