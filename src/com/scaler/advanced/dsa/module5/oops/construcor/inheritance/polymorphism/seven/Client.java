package com.scaler.advanced.dsa.module5.oops.construcor.inheritance.polymorphism.seven;

public class Client {
    public static void main(String[] args) {
        C obj = new P();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
