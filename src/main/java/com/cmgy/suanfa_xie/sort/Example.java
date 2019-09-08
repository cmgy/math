package com.cmgy.suanfa_xie.sort;

import java.sql.SQLOutput;

public class Example {

//    public void sort(Comparable[] a) {
//
//    }

    protected long count(Comparable[] a,Sort sort) {
        long start = System.currentTimeMillis();
        sort.sort(a);
        return System.currentTimeMillis() - start;
    }

    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected void show(Comparable[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//        }

        for (Comparable i : a) {
            System.out.println(i + " ");
        }
    }

    protected Comparable[] copy(Comparable[] a) {
        Comparable[] copy = new Comparable[a.length];

        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }

        return copy;
    }

    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
