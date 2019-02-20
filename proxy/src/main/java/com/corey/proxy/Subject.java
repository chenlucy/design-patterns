package com.corey.proxy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/20.
 */
public interface Subject {
    void notified();
    void add(Proxy proxy);
    void del(Proxy proxy);
    String getActive();
    void setActive(String active);
}
