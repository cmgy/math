package com.cmgy.sword.array;

import com.cmgy.suanfa_xie.sort.Example;
import org.junit.Assert;
import org.junit.Test;

/*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
public class Solution32 {

    public void reOrderArray(int [] a) {

        int[] copy = copy(a);

        int N = a.length;

        int j = 0;
        for (int i = 0; i < N; i++) {
            if (isQ(copy[i])) {
                a[j] = copy[i];
                j++;
            }
        }

        int k = j;

        for (int i = 0; i < N; i++) {
            if (!isQ(copy[i])) {
                a[k] = copy[i];
                k++;
            }
        }
    }

    protected void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    protected void show(int[] a) {

        for (int i : a) {
            System.out.println(i + " ");
        }
    }

    boolean isQ(int i) {
        return i % 2 == 1;
    }

    private int[] copy(int[] a) {
        int[] copy = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }

        return copy;
    }

    @Test
    public void test01() {
        int[] data = new int[]{5, 3, 33, 8, 7, 1, 0};
        reOrderArray(data);
        show(data);
        Assert.assertEquals(5,data[0]);
        Assert.assertEquals(3,data[1]);
        Assert.assertEquals(33,data[2]);
        Assert.assertEquals(7,data[3]);
        Assert.assertEquals(1,data[4]);
        Assert.assertEquals(8,data[5]);
        Assert.assertEquals(0,data[6]);
    }


}
