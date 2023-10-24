package com.dlx.test;

public class TestDemo46 {

    public static void main(String[] args) {
        System.out.println("main() is start...");
        m1();
        System.out.println("main() is stop...");
    }

    //2.创建m1()
    private static void m1() {
        System.out.println("m1() is start...");
        m2();
        System.out.println("m1() is stop...");
    }

    //3.创建m2()
    private static void m2() {
        System.out.println("m2() is start...");
    }

}
