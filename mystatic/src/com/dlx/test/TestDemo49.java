package com.dlx.test;

public class TestDemo49 {
    public static void main(String[] args) {
        int moneyPreferential = 16 + 8 + 3;
        double moneyDiscount = 24 + 8 + 3 > 30 ? (24 + 8 + 3) * 0.8 : 24 + 8 + 3;
        double result = moneyPreferential < moneyDiscount ? moneyPreferential : moneyDiscount;
        System.out.print("这个小伙要点这三样东西，最小要花 " + result + " 元");
    }


}
