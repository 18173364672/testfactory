package com.qyj.controller.simpleFactory;

public class test {
    public static void main(String[] args) {
        /**
         * 简单工厂模式
        * */
//        SendFactory sf = new SendFactory();
//        sender sender = sf.produce("mail");
//        sender.send();

        /**
         * 多个工厂模式，不需要传String调用
         * */
//        SendFactory1 sf = new SendFactory1();
//        sender sender = sf.SmsSender();
//        sender.send();

        /**
         * 静态工厂模式,免创建直接使用
         * */
//        sender sender = sf.SmsSender();
//        sender.send();

        /**
         * 抽象工厂模式
         * */
        Provider provider = new MailSendFactory();
        sender sender = provider.produce();
        sender.send();

    }
}
