package com.dlx.test;

import java.io.*;
import java.util.Scanner;

public class TestDemo28 {

        public static void main(String[] args) {
            //1.提示并接收用户输入的两个路径
            System.out.println("请输入源文件的路径1:");
            String f1 = new Scanner(System.in).nextLine();//被复制的那个文件
            System.out.println("请输入源文件的路径2:");
            String f2 = new Scanner(System.in).nextLine();//被复制的那个文件
            System.out.println("请输入新文件的路径:");
            String t = new Scanner(System.in).nextLine();//复制好的新文件
            //2.调用创建好的自定义方法,完成文件的复制
            Copy(f1,f2,t);//使用字节流完成复制的操作
        }

        //使用字节流完成文件复制的操作
        private static void Copy(String f1,String f2, String t) {
            //1.定义两个在本方法中都生效的字节流局部变量,注意初始化值为null
            BufferedInputStream in1 = null;//高效字节输入流,用于读取
            BufferedInputStream in2 = null;//高效字节输入流,用于读取
            BufferedOutputStream out = null;//高效字节输出流,用于写出
            //2.由于IO操作可能会发生异常,所以需要完成try-catch-finally结构
            try{
                //3.1创建一个高效字节输入流对象,用于读取源文件
                in1 = new BufferedInputStream(new FileInputStream(f1));
                in2 = new BufferedInputStream(new FileInputStream(f2));
                //3.2创建一个高效字节输出流对象,用于向新文件输出数据
                out = new BufferedOutputStream(new FileOutputStream(t,true));


                //4.使用两个流对象完成复制操作
                int b;
                while((b=in1.read())!=-1){
                    out.write(b);
                }
                int b2;
                while((b2=in2.read())!=-1){
                    out.write(b2);
                }
                System.out.println("恭喜!复制成功!");
            }catch (IOException e){
                System.out.println("复制失败!");
                e.printStackTrace();
            }finally {
                //5.关流
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    in2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    in1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
