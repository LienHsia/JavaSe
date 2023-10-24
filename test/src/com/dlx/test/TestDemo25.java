package com.dlx.test;


import java.util.Scanner;

public class TestDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("成绩：");
            String ss = sc.nextLine();
            try {
                score = Integer.parseInt(ss);
                if (score >= 0 && score <= 100) {
                    break;
                }
                System.out.println("成绩应该是0到100之间!");
            } catch (Exception e) {
                System.out.println("成绩格式不合法!");
            }
        }
        int level = score / 10;
        char res = '\0';
        // 允许的数据类型为3种整型(byte short int)、字符、字符串(hashcode值比对)、
        //enum枚举类型
        switch (level) {
            case 10:
            case 9:
                res = 'A';
                break;
            case 8:
            case 6:
            case 7:
                res = 'B';
                break;
            default:
                res = 'C';
                break;
        }
    }


}

