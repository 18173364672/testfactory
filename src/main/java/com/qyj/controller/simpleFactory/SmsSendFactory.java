package com.qyj.controller.simpleFactory;

/**
 * 抽象工厂模式
 * */
public class SmsSendFactory implements Provider{
    @Override
    public sender produce() {
        return new sms();
    }
}
