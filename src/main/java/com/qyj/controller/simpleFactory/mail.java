package com.qyj.controller.simpleFactory;

public class mail implements sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
