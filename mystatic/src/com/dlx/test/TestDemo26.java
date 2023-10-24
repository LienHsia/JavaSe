package com.dlx.test;

import java.util.Scanner;

public class TestDemo26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正偶数");
        int n;
        while (true) {
            n = sc.nextInt();
            if (n <= 0 || n % 2 != 0) {
                System.out.println("输入的数不是正偶数，请重新输入");
            } else if (n == 2) {
                System.out.println("2不能拆分");
            } else {
                break;
            }
        }

        for (int i = 2; i < n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + "=" + i + "+" + (n - i));
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean isprime = true;
        int len = num / 2;
        for (int i = 2; i < len; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        if (num == 2) {
            return true;
        }
        return isprime;
    }

}
