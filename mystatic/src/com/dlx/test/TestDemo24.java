package com.dlx.test;

import java.util.Scanner;

public class TestDemo24 {

        public static void main(String[] args) {
            //1.提示并接收用户输入的月份
            System.out.println("请输入您要查看的月份:");
            int month = new Scanner(System.in).nextInt();

            //2.对用户输入的数据进行合法性检测
            if(month <= 0 || month >12){
                System.out.println("您输入的月份不正确!应该是1-12月以内");
            }else{
                //3.判断接收到的合法数据属于哪个季节,并将结果输出
                if(month >=3 && month <=5){
                    System.out.println(month+"月是春天");
                }else if(month >=6 && month <=8){
                    System.out.println(month+"月是夏天~");
                }else if(month >=9 && month <=11){
                    System.out.println(month+"月是秋天");
                }else{
                    System.out.println("冬天就要来啦,春天还会远吗?");
                }
            }
        }


}
