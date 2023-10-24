package com.dlx.test;

public abstract class Fruit {
    // 榨汁方法
    public abstract void juice();
}

class Apple extends Fruit {
    @Override
    public void juice() {
        System.out.println("榨出苹果汁");
    }
}

class Watermelon extends Fruit {
    @Override
    public void juice() {
        System.out.println("榨出了西瓜汁");
    }
}