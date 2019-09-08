package com.cmgy.suanfa_xie.sort;

import org.junit.Assert;
import org.junit.Test;

public class Merge extends Example {

    Comparable[] aux;

    public void sort(Comparable[] a) {

        aux = copy(a);

        sort(a, 0, a.length - 1);
    }


    public void sortBU(Comparable[] a) {

        for (int sz = 1; sz < a.length ; sz++) {
            for (int lo = 0; lo < a.length - sz; lo += (sz + sz)) {
                int mid = lo +   - 1;
                int hi = Math.min(mid + sz, a.length - 1);
                merge(a, lo, mid, hi);
            }
        }
    }

    public void sort(Comparable[] a, int lo, int hi) {

        if (lo >=hi) {
            return;
        }
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private void merge(Comparable[] a, int lo, int mid, int hi) {
        aux = copy(a);
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            }else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];

            }else{
                a[k] = aux[j++];

            }
        }
    }

    @Test
    public void test01() {
        Integer[] data = new Integer[]{1, 9, 33,2, 7, 11, 44};
        merge(data,0,2,6);
        show(data);

    }

    @Test
    public void test02() {
        Integer[] data = new Integer[]{5, 3, 33, 8, 7, 1, 0};
        sort(data);
        show(data);
        Assert.assertTrue(isSorted(data));
    }

    @Test
    public void test03() {
        Integer[] data = new Integer[]{5, 3, 33, 8, 7, 1, 0};
        sortBU(data);
        show(data);
        Assert.assertTrue(isSorted(data));
    }

}
