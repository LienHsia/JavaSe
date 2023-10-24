package com.dlx.test;

import java.util.Scanner;

public class TestDemo40 {
    public static void main(String[] args) {
        //1.提示并接收用户要计算的自然数:
        System.out.println("请输出您要求和的自然数:");
        int n = new Scanner(System.in).nextInt();
        //2.定义一个变量用来保存最终求和的结果
        int sum=0;
        //3.循环获取每一位上的数
        while(n!=0){
            //4.求当前的个位数,并将个位数累加
            sum = sum + (n%10);
            //5.去掉刚刚累加过的最后一位数,得到新的整数
            //比如刚刚的十位就变成了现在的个位
            n=n/10;
        }
        //6.打印最终的结果:
        System.out.println(sum);
    }

}
