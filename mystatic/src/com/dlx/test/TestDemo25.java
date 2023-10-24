package com.dlx.test;

import java.util.Random;

public class TestDemo25 {

    public static void main(String[] args) {


        //正向思维
        int count = 0;
        for (int i = 1; i < 10000; i++)
            //一个整数，它加上100或者268后都是一个完全平方数
            if (Math.sqrt(i + 100) % 1 == 0 || (Math.sqrt(i + 268) % 1 == 0)) {
                count++;
                if (count % 10 == 0)
                    System.out.println();
                System.out.print(i + "    ");
            }
        System.out.print("\n在1万以内，这样的数有" + count + "个");

    }


}
