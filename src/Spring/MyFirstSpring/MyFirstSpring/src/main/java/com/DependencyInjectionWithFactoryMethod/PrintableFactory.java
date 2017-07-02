package com.DependencyInjectionWithFactoryMethod;

import java.util.Random;

public class PrintableFactory {
    public static Printable getPrintable() {
        Random rand = new Random();

        int a = rand.nextInt(100);
        if (a % 2 == 0) {
            System.out.println("B return");
            return new B();
        }
        System.out.println("A return");

        return new A();// return any one instance, either A or B
    }
}