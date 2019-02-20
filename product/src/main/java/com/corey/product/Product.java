package com.corey.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class Product implements Serializable {
    private List<String> parts = new ArrayList<String>();
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        System.out.println("生成的产品详情：");
        for (String s:parts) {
            System.out.println(s);
        }
    }
}
