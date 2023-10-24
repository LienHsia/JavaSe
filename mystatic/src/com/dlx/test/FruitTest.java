package com.dlx.test;

public class FruitTest {
    public static void main(String[] args) {
        Fruit f1 = new Apple();
        Fruit f2 = new Watermelon();
        juicer(f1);
        juicer(f2);
    }
    // 榨汁机方法
    public static void juicer(Fruit fruit){
        System.out.println("榨汁机");
        fruit.juice();
    }
}
