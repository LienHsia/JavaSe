package com.dlx.test;

import java.util.Scanner;

public class TestDemo48 {

    public static void main(String[] args) {
        //1.提示并接收用户输入的星期数
        System.out.println("请输入今天的星期数：(1~7)");
        int day = new Scanner(System.in).nextInt();
        //2.对用户输入的数据进行合理性判断
        if (day < 1 || day > 7) {
            System.out.println("您输入的天数有误哦~请重新输入~");
        } else {//输入正确的数据才会进一步判断
            if (day == 1) {
                System.out.println("今天周一，该去跳绳啦！");
            } else if (day == 2) {
                System.out.println("今天周二，该去跑步啦！");
            } else if (day == 3) {
                System.out.println("今天周三，该去做瑜伽啦！");
            } else if (day == 4) {
                System.out.println("今天周四，该去做普拉提啦！");
            } else if (day == 5) {
                System.out.println("今天周五，该去打网球啦！");
            } else if (day == 6) {
                System.out.println("今天周六，该去游泳啦！");
            } else if (day == 7) {
                System.out.println("今天周日，休息日，休息一天吧！");
            }
        }
    }


}
