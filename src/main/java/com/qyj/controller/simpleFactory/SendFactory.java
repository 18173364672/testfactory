package com.qyj.controller.simpleFactory;

/**
 * 简单工厂模式
 * */
public class SendFactory {
    public sender produce(String type){
        switch (type) {
            case "mail":
                return new mail();
            case "sms":
                return new sms();
            default:
                System.out.println("请输入正确的类型！");
                return null;
        }
    }
}
