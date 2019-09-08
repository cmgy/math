package com.cmgy.suanfa_xie.sort;

import org.junit.Assert;
import org.junit.Test;

/*需要N^2/4次比较
* N^2/4次交换
* 交换操作，和数组中倒置的数量相同
* 倒置：指的是数组中两个顺序颠倒的元素*/
public class Insertion extends Example {

    public void sortU1(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (!less(a[j-1], a[j])) {
                    exch(a, j-1, j);
                }
            }
        }
    }

    public void sortU2(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {
            int j=0;
            Comparable insert = a[i];
            for (j = i - 1; j >= 0 && less(insert, a[j]); j--) {
                a[j + 1] = a[j];
            }
            a[j+1] = insert;
        }
    }


    @Test
    public void test01() {
        Integer[] data = new Integer[]{33, 3, 5, 8, 7, 1, 0};
        System.out.println("count time is:"+count(data, new Sort() {
            @Override
            public void sort(Comparable[] a) {
                sortU1(a);
            }
        }));
        show(data);
        Assert.assertTrue(isSorted(data));
    }

    @Test
    public void test02() {
        Integer[] data = new Integer[]{33, 3, 5, 8, 7, 1, 0};
        System.out.println("count time is:"+count(data, new Sort() {
            @Override
            public void sort(Comparable[] a) {
                sortU1(a);
            }
        }));
        show(data);
        Assert.assertTrue(isSorted(data));
    }
}
