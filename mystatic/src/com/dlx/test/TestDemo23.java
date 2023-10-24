package com.dlx.test;

import java.util.Scanner;

public class TestDemo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入想要打印的等腰三角形的行数：");
        int num = input.nextInt();
        for (int i = 1;i<= num ;i ++){                      //i用于控制行数
            for (int blank = 1;blank <= num-i;blank ++)     //打印空白
                System.out.print(" ");
            for (int star = 1;star <= i * 2 - 1 ;star ++)   //打印五角星
                System.out.print("*");
            System.out.println();                           //换行
        }
            input.close();
    }
}
