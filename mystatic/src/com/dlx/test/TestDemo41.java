package com.dlx.test;

import java.io.File;

public class TestDemo41 {
    public static void main(String[] args) {
        //1.指定要删除的目录
        /**为了更好的测试,注意指定的目录是已存在的目录,但是,千万不要删盘符!!!!*/
        /*我们也有一些没有权限的文件夹,那个是无法访问且不能删除的哦*/
        File file = new File("D:\\ready\\a");
        //2.调用删除目录的方法
        boolean result = del(file);
        //3.打印删除的结果
        System.out.println("删除的结果为:"+result);
    }

    public static boolean del(File file) {//完成的同学不是很多,抓紧时间写,写完截图发群里哈,这首歌结束我们继续
        //1.列出文件夹下的所有资源
        File[] fs = file.listFiles();
        //2.循环遍历拿到的所有资源
        for (int i = 0; i < fs.length; i++) {
            //2.1获取本次循环遍历到的file对象
            File f = fs[i];
            //3.判断,当前资源是文件还是文件夹
            if(f.isFile()) {
                f.delete();//是文件,直接删除
                System.out.println(file.getName()+"文件删除成功!");
            }else if(f.isDirectory()) {
                //是文件夹,需要继续进行步骤1 2 ,出现了重复调用的情况
                //递归,在方法的内部调用自己
                del(f);
            }
        }
        //位置:在for循环执行之外删除文件夹
        file.delete();//空文件夹直接删除
        System.out.println(file.getName()+"文件夹删除成功!");
        return true;
    }
}
