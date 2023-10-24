package com.dlx.test;

public class TestDDemo19 {

    /**
     * 获取1000以内的完数
     */

    public static void main(String[] args) {
        //1.循环遍历1000以内的所有数
        for (int i = 1; i <= 1000; i++) {
            //2.定义一个变量来保存求和的结果
            int sum = 0;
            //3.求i的因子
            for (int j = 1; j <= i / 2; j++) {
                //4.判断是否能被整除
                if (i % j == 0) {
                    //5.如果能整除,就是因子,因子需要累加
                    sum += j;
                }
            }
            //6.如果因子累加之和为本轮判断的数,则当前数是完数,输出
            if (sum == i) {
                System.out.println(i);

            }
        }
    }
}
