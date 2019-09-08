package com.cmgy.suanfa_xie.sort;

import org.junit.Assert;
import org.junit.Test;

/*需要N^2/2次比较
* N次交换
* 运行时间和输入无关
* 数据移动是最少的*/
public class Selection extends Example {
    public void sort(Comparable[] a) {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (!less(a[min], a[j])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }


    @Test
    public void test01() {
        Integer[] data = new Integer[]{5, 3, 33, 8, 7, 1, 0};
        sort(data);
        Assert.assertTrue(isSorted(data));
        show(data);
    }
}
