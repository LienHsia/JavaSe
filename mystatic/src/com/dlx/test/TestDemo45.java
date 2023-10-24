package com.dlx.test;

public class TestDemo45 {

    public static void main(String[] args) {
        byte a = 10;
        short b = a;//不会报错,小转大

        int c = 1;
        long d = c;//不会报错,小转大

        float f = 3.1415f;
        double e = f;//不会报错,小转大

        long g = 8274624867L;
        float h = g;//不会报错,小转大
        System.out.println(h);

        char i = 'a';
        int j = i;//不会报错,小转大
        System.out.println(j);//97

        int a1 = 1;
        byte b1 = 2;
        //byte c1 = a1+b1;会报错,大转小
        byte c1 = (byte) (a1 + b1);//需要强制类型转换

        byte d1 = (byte) 128;
        System.out.println(d1);//-128,需要强转,注意发生数据溢出的问题

        short e1 = 'a';
        char f1 = 120;
        System.out.println(e1);//97,打印的是编码值
        System.out.println(f1);//'x',打印是根据编码找到的字符

        float h1 = 32874.435F;
        int i1 = (int) h1;//大转小 强制转
        System.out.println(i1);//32874 浮变整 小数没
    }


}
