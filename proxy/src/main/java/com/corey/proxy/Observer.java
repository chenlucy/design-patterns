package com.corey.proxy;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/20.
 */
public class Observer  extends Proxy{

    public Observer(String name, Subject subject) {
        super.setName(name);
        super.setSubject(subject);
    }
    @Override
    public void update(){
        System.out.println(super.getSubject().getActive()+super.getName()+"快关闭NBA视频，继续工作！");
    }
}
