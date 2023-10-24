package com.dlx.test;

public class Student {
    private String name;
    private int age;
    private double height;
    private boolean marry;
    private char sex;
    // 无参构造
    public Student() {
    }
    // 全参构造
    public Student(String name, int age, double height, boolean marry, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.marry = marry;
        this.sex = sex;
    }
    // 重写 toString 方法
    @Override
    public String toString() {
        return "学生信息: {" +
                "姓名: '" + name + '\'' +
                ", 年龄: " + age +
                ", 身高: " + height +
                ", 婚否: " + marry +
                ", 性别: " + sex +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public boolean isMarry() {
        return marry;
    }
    public void setMarry(boolean marry) {
        this.marry = marry;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}