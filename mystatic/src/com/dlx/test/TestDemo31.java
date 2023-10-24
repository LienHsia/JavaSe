package com.dlx.test;

public class TestDemo31 {

    public static void main(String[] args) {
        //f1();
        int result = sum(1, 2);
        System.out.println(result);
        double result2 = sum(5.5, 1.1);
        System.out.println(result2);
        double result3 = sum(8.8, 1);
        System.out.println(result3);
        double result4 = sum(7, 2.2);
        System.out.println(result4);
    }

    //1.方法一：传入两个int类型的参数，并返回这两个数的和，方法名为sum
    public static int sum(int a, int b) {
        //return a+b;
        int c = a + b;
        return c;
    }

    //2.方法二：传入两个double类型的参数，并返回这两个数的和，方法名为sum
    public static double sum(double aa, double bb) {

        return aa + bb;
    }

    //3.方法三：传入一个double类型的参数，一个int类型的参数，并返回这两个数的和，方法名为sum
    public static double sum(double a, int b) {
        return a + b;
    }

    //4.方法四：传入一个int类型的参数，一个double类型的参数，并返回这两个数的和，方法名为sum
    public static double sum(int a, double b) {
        return a + b;
    }

    private static void f1() {
        //演示重载的现象
        System.out.println("HelloWorld");
        System.out.println(1);
        System.out.println(4.5);
        System.out.println('a');
        System.out.println(true);
    }

}
