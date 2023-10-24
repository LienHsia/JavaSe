package com.dlx.test;

import java.util.Scanner;

public class TestDemo39 {
    public static void main(String[] args) {
        //需求:接收用户今天输入的颜色,推荐菜品
        //1.提示并接收用户输入的颜色
        System.out.println("请输入您今天心情的颜色:");
        String color = new Scanner(System.in).nextLine();
        switch (color) {
            case "红":
                System.out.println("红烧鱼");
                break;//为了避免穿透
            case "黄":
                System.out.println("菠萝炒饭");
                break;
            case "橙":
                System.out.println("水煮肉片");
                break;
            default:
                System.out.println("哎呀,没有识别到这个功能呢,正在开发中...");
        }
    }
}
