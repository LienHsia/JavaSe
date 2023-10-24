package com.dlx.test;

import java.util.Scanner;

public class TestDemo43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("您现在有多少钱（元）？");
        int money =input.nextInt();

        int bottleNum = 0,bottleNumAll = 0;  //bottleNum记录暂时的瓶子数，bottleNumAll记录总共的瓶子数，即输出的结果
        while (money >= 3) {     //剩下的钱不够买饮料的
            bottleNum = money / 3 ;                     //第一步：买20 / 3 =6瓶饮料        //第四步：买8 / 3 =2瓶饮料       //第六步：买4 / 3 =1瓶饮料
            bottleNumAll += bottleNum;
            money = money - bottleNum *3 +bottleNum;    //第二步：还剩20 - 18 +6 =8元     //第五步：还剩8 - 6 +2 =4元     //第七步：还剩4 - 3 + 1 =2元
        }

        System.out.print("您一共可以购买 " + bottleNumAll + " 瓶饮料。");
        input.close();
    }
}
