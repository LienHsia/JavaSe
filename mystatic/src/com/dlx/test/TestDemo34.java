package com.dlx.test;

public class TestDemo34 {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
