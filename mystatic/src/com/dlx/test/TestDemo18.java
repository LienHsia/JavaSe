package com.dlx.test;

import java.util.Scanner;

public class TestDemo18 {
    /*
    返回第n项斐波那契数列
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要输出的项数：");
        int i=scanner.nextInt();
        System.out.println(Fib(i));
    }

    public static int Fib(int i){
        if(i==1||i==2){
            return 1;
        }else{
            return Fib(i-1)+Fib(i-2);
        }
    }
}
