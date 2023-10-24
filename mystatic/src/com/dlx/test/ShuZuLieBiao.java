package com.dlx.test;

import java.util.Arrays;

public class ShuZuLieBiao<T> {
    T[] a;
    int index;

    public ShuZuLieBiao() {
        this(10);
    }

    public ShuZuLieBiao(int length) {
        a = (T[]) new Object[length];
    }

    public void add(T t) {
        //确认容量
        queRenRongLiang();
        a[index] = t;
        index++;
    }

    private void queRenRongLiang() {
        //还有位置
        if (index < a.length) {
            return;
        }
        //容量增长1.5倍
        //防止初始长度是0，再加两个位置
        int n = a.length + a.length / 2 + 2;
        a = Arrays.copyOf(a, n);
    }

    public T get(int i) {
        jianChaFanWei(i);
        return a[i];
    }

    private void jianChaFanWei(int i) {
        //检查下标范围
        if (i < 0 || i >= index) {
            //抛出一个异常，表示这里出错
            throw new IndexOutOfBoundsException(
                    "下标：" + i);
        }
    }

    public int size() {
        return index;
    }

    public T remove(int i) {
        jianChaFanWei(i);//检查范围
        T t = a[i];//取出i位置的值
        /* [i+1, index) 范围的值，向前复制1位
         *      i
         * [1,2,4,5,6,-,-,-,-,-,-]
         *            |
         *            index
         */
        System.arraycopy(a, i + 1, a, i, index - i - 1);
        a[index - 1] = null;
        index--;
        return t; //返回被移除的值
    }
}