package com.dlx.test;

public class TestDemo44 {
    public static void main(String[] args) {
        char[][] a = {
                //i
                /*0*/{'道','路','千','万','条'},
                /*1*/{'安','全','第','一','条'},
                /*2*/{'行','车','不','规','范'},
                /*3*/{'亲','人','两','行','泪'}
                //0    1    2    3    4    j
        };
        /* j是外层循环，递增
         *    i是内层循环，递减
         * 亲行安道
         * 人车全路
         * 两不第千
         */
        for(int j=0;j<a[0].length;j++) {
            for(int i=a.length-1; i>=0; i--) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
