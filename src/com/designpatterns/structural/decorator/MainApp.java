package com.designpatterns.structural.decorator;

/*
 * Video Reference: https://youtu.be/v6tpISNjHf8
 */
public class MainApp {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");

    }

}
