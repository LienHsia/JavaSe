package com.dlx.test;

public class TestDemo33 {
    public static void main(String[] args) {
        double pi = 4;
        double temp = 0;
        int flag = -1;
        for (int i = 3; i <= 100000000; i += 2) {
            temp = 4.0 / i;
            pi = pi + flag * temp;
            flag = -1*flag;
            if (pi > 3.1415 && pi < 3.1416) {
                System.out.println("pi=" + pi);
                break;
            }
        }
    }
}
