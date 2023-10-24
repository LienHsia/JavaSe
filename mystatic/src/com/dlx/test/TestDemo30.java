package com.dlx.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestDemo30 {

    /**
     * 本类用于进一步测试List接口
     */
    public static void main(String[] args) {
        //1.创建List接口的多态对象
        List<String> list = new ArrayList<>();
        //2.向创建好list集合添加元素
        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒羊羊");
        list.add("沸羊羊");
        list.add("小肥羊");
        list.add("肥羊卷");
        System.out.println(list);
        System.out.println("listIterator的逆序遍历：");
        ListIterator<String> it3 = list.listIterator();
        while (it3.hasNext()) {//判断是否有下一个元素可迭代
            System.out.println(it3.next());//打印当前迭代到的元素
            if (!it3.hasNext()) {//直到迭代器没有下一个元素可迭代--到最后了
                System.out.println("开始逆序迭代：");
                while (it3.hasPrevious()) {//判断是否有上一个元素可迭代
                    System.out.println(it3.previous());//打印获取到的上一个元素
                }
                break;//终止循环，不然会一直从头到尾，再从尾到头迭代
            }
        }
    }


}
