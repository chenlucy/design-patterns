package com.corey.person;

/**
 * @Describe 类描述，功能介绍
 * @Author chenlu
 * @Version V1.0
 * @Date 2019/2/18.
 */
public class SmartPerson implements IBuilder {

    private Person person;
    public SmartPerson(){
        person=new Person();
    }

    @Override
    public void setBody() {
        person.setBody("聪明人的身体，弱不禁风");
    }
    @Override
    public void setHead() {
        person.setHead("聪明人的大脑，智商180");
    }
    @Override
    public void setFoot() {
        person.setFoot("聪明人的腿，还能走两步");
    }
    @Override
    public void setHand() {
        person.setHand("聪明人的手，比较灵活");
    }
    @Override
    public Person getPerson() {
        return person;
    }
}
