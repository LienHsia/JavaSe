package com.dlx.test;

import java.util.Arrays;

public class TestDemo36 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
