package com.dlx.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestDemo38 {
    public static void main(String[] args) {
        //传入一个随机数组，进行排序，然后将排好序的数组返回
        //1.用来生成一个随机数组
        Integer[] a = createArray();
        System.out.println(Arrays.toString(a));
        //2.传入刚刚生成的随机数组，排序，将排序后的数组返回
        Integer[] b = sortArray(a);
        System.out.println(Arrays.toString(b));
    }
    public static Integer[] sortArray(Integer[] a){
        //需要对传入的数组进行排序
        //Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());
        return a;
    }
    //修饰符 返回值类型 方法名(参数列表){方法体}
    public static Integer[] createArray(){
        //生成一个随机数组，并将结果返回
        //1.动态创建一个长度随机的数组
        //int length = new Random().nextInt(10);//[0,10)
        int length = new Random().nextInt(5)+5;//[0,5)->[0+5,5+5)->[5,10)
        Integer[] a = new Integer[length];//数组的长度是生成的随机长度length
        /**数组长度可以为0*/
        //2.遍历数组，依次向数组中的每个位置存入随机值
        for(int i = 0;i<=a.length-1;i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }
}
