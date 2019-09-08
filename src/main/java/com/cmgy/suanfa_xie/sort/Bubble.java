package com.cmgy.suanfa_xie.sort;

import org.junit.Assert;
import org.junit.Test;

public class Bubble extends Example {
    public void sort(Comparable[] a) {

        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i-1; j++) {
                if (less(a[j + 1], a[j])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    @Test
    public void test01() {
        Integer[] data = new Integer[]{5, 3, 33, 8, 7, 1, 0};
        sort(data);
        show(data);
        Assert.assertTrue(isSorted(data));
    }
}
