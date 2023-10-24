package com.dlx.test;

public class ApplianceTest {
    public static void main(String[] args) {
        // 冰箱类
        Refrigerator rf = new Refrigerator("美的","M101","红色","10000","双门","制冷");
        rf.showInfo();
        System.out.println("");
        // 电视类
        Television tv = new Television("康佳","L100","黑色","2000","50","3840*2160");
        tv.showInfo();
        System.out.println("");
        // 洗衣机类
        WashingMachine wm = new WashingMachine("美的","M102","白色","1000","M203","3L");
        wm.showInfo();
    }
}
