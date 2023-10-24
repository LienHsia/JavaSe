package com.dlx.test;

import java.util.Scanner;

public class Product {


    //成员变量
    static String[] names = {"iPhoneXS", "华为 Mate 20 pro", "小米X", "vivo NEX", "oppo Find"};
    static double[] price = {8999, 5399, 2399, 4399, 3999};
    static int[] numbers = {50, 20, 80, 120, 90};

    public static void main(String[] args) {
        /*
         * ----------------------
         * 1. 商品列表
         * 2. 商品录入
         * 3. 商品查询
         * 4. 统计信息
         * 5. 退出
         * ----------------------
         * 选择：> 1
         * ....
         */

        //死循环显示菜单
        outer:
        while (true) {
            //显示菜单，并获得选择的值
            int c = menu();
            //判断c的值
            switch (c) {
                case 1:
                    f1();
                    break;
                case 2:
                    f2();
                    break;
                case 3:
                    f3();
                    break;
                case 4:
                    f4();
                    break;
                case 5:
                    break outer;
            }
        }
    }

    private static int menu() {
        System.out.println("----------------------");
        System.out.println("1. 商品列表");
        System.out.println("2. 商品录入");
        System.out.println("3. 商品查询");
        System.out.println("4. 统计信息");
        System.out.println("5. 退出");
        System.out.println("----------------------");
        System.out.print("选择：> ");
        return new Scanner(System.in).nextInt();
    }

    private static void f1() {
      /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
           0     1    2
         1. 名称：xx，价格：xx，数量：xx
       */
        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            double p = price[i];
            int b = numbers[i];
            System.out.println(
                    (i + 1) + ". 名称：" + n + "，价格：" + p + "，数量：" + b);
        }
    }

    private static void f2() {
      /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
          0     1    2
      */
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println("录入第" + (i + 1) + "件商品：");
            System.out.print("名称：");
            String n = new Scanner(System.in).nextLine();
            System.out.print("价格：");
            double p = new Scanner(System.in).nextDouble();
            System.out.print("数量：");
            int b = new Scanner(System.in).nextInt();
            names[i] = n;
            price[i] = p;
            numbers[i] = b;
        }
        //重新显示商品列表
        f1();
    }

    private static void f3() {
      /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
          0     1    2
        字符串，比价是否相等，要用equals()方法
        a = "aaa"
        b = "aaa"
        a.equals(b)
       */
        System.out.print("输入查询的商品名：");
        String n = new Scanner(System.in).nextLine();
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            // n 和 names[i] 相等
            if (n.equals(names[i])) {
                String name = names[i];
                double p = price[i];
                int b = numbers[i];
                System.out.println(
                        (i + 1) + ". 名称：" + name + "，价格：" + p + "，数量：" + b);
                return;
            }
        }
        //循环结束，所有商品都比较完，没有找到
        System.out.println("找不到商品");
    }

    private static void f4() {
      /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
              0     1     2
       */
        //商品总价，单价均价，最高单价，最高总价
        double spzj = 0;//商品总价
        double djzj = 0;//单价总价
        double zgdj = 0;//最高单价
        double zgzj = 0;//最高总价
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            spzj += price[i] * numbers[i];
            djzj += price[i];
            //数组中，找到更大的值
            if (price[i] > zgdj) {
                zgdj = price[i];//更大值存到这个变量
            }
            if (price[i] * numbers[i] > zgzj) {
                zgzj = price[i] * numbers[i];
            }
        }
        System.out.println("商品总价：" + spzj);
        System.out.println("单价均价：" + (djzj / names.length));
        System.out.println("最高单价：" + zgdj);
        System.out.println("最高总价：" + zgzj);
    }


}
