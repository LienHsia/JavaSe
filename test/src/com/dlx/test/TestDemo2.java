package com.dlx.test;

import java.util.Scanner;

public class TestDemo2 {
    /*
    五位回文数判断
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TestDemo2 main = new TestDemo2();
        int number = console.nextInt();
        System.out.println(main.palindromeNumber(number));
    }

    public Boolean palindromeNumber(int number) {

        int fb=number;
        int sum=0;
        for(int i=0;i<5;i++){
            int ge=number%10;
            sum=sum*10+ge;
            number=number/10;
        }
        if(sum==fb){
            return true;
        }
        return false;
    }
}
