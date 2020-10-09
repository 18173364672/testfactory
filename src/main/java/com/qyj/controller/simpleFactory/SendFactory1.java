package com.qyj.controller.simpleFactory;

/**
 * 多个工厂模式
* */
public class SendFactory1{
    public sender MailSender(){
        return new mail();
    }

    public sender SmsSender(){
        return new sms();
    }

}
