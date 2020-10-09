package com.qyj.controller.simpleFactory;

public class sms implements sender{
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
