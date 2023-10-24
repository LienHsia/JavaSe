package com.dlx.test;

public class TestDemo42 {
    public static void main(String[] args) {
        //引用类型Cat类型的变量c1 c2 保存的是对象的地址值
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};

        int b1 = 4;
        int b2 = 4;

        boolean f1 = true;
        boolean f2 = true;
        /* == 如果比较的是基本类型,比较的是值,字面值,具体存的那个数*/
        System.out.println(b1 == b2);//true
        System.out.println(f1 == f2);//true

        /* == 如果比较的是引用类型,比较的也是值,地址值*/
        System.out.println(c1 == c2);//false
        System.out.println(a1 == a2);//false
    }
}

class Cat {
    String name;
    int age;

    public void bark() {
        System.out.println("小猫喜欢喵喵叫");
    }
}
