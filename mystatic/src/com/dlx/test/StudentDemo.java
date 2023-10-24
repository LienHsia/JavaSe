package com.dlx.test;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接收用户输入
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String ageStr = sc.nextLine();
        System.out.println("请输入身高：");
        String heightStr = sc.nextLine();
        System.out.println("请输入婚否："); //必须输入 true 或 false
        String marryStr = sc.nextLine();
        System.out.println("请输入性别：");
        String genderStr = sc.nextLine();
        // 类型转换
        int age = Integer.parseInt(ageStr);
        double height = Double.parseDouble(heightStr);
        boolean marry = Boolean.parseBoolean(marryStr);
        char sex = genderStr.charAt(0);
        // 存储对象
        Student stu = new Student(name, age, height, marry, sex);
        // 打印信息
        System.out.println(stu);
    }
}
