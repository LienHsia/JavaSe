package com.dlx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class TestDemo51 {
	public static void main(String[] args) {
		/*
		 * 集合、泛型，都不支持基本类型
		 * 用基本类型的包装类
		 */
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("回车继续");
		while(true) {
			new Scanner(System.in).nextLine();
			int n = new Random().nextInt(100);
			//二分法查找，在list中找n所在的位置
			//找不到，返回 -(插入点+1)
			int index = Collections.binarySearch(list, n);  
			if(index < 0) {
				index = (-index)-1;
			}
			list.add(index, n);
			System.out.println(list.toString());
		}
	}

}
