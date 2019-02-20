package com.corey.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/20.
 */
public class Boss implements Subject{

    private List<Proxy>list=new ArrayList<>();

    private String active;

    @Override
    public void notified(){
        for (Proxy c:list) {
            c.update();
        }
    }
    @Override
    public void add(Proxy c){
        this.list.add(c);
    }
    @Override
    public void del(Proxy c){
        this.list.remove(c);
    }
    @Override
    public String getActive() {
        return active;
    }
    @Override
    public void setActive(String active) {
        this.active = active;
    }
}
