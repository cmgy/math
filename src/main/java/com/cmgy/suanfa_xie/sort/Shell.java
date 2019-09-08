package com.cmgy.suanfa_xie.sort;

import org.junit.Assert;
import org.junit.Test;

public class Shell extends Example {

    public void sortU1(Comparable[] a) {

        int N = a.length;
        int h = N / 3 + 1;

        while (h >= 1) {
            sortH(a, h);
            h = h / 3;
        }

    }


    public void sortH(Comparable[] a, int h) {

        int N = a.length;

        for (int i = h; i < N ; i++) {
            for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {

                exch(a, j - h, j);
            }
        }
    }

    @Test
    public void test01() {
        Integer[] data = new Integer[]{5, 3, 33, 8, 7, 1};
        sortH(data,2);
        show(data);
    }

    @Test
    public void test02() {
        Integer[] data = new Integer[]{5, 3, 33, 8, 7, 1, 0};
        sortU1(data);
        show(data);
        Assert.assertTrue(isSorted(data));
    }
}
