package com.corey.proxy.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/20.
 */
public abstract class Subject {
    private List<Observer> list=new ArrayList<Observer>();
    void add(Observer o){
        list.add(o);
    }
    void del(Observer o){
        list.remove(o);
    }
    void notified(){
        for (Observer o:list) {
            o.update();
        }
    }

    public List<Object> getList() {
        List<Object> ls= new ArrayList<>();
        for (Observer o:list) {
            ls.add(o);
        }
        return ls;
    }
}
