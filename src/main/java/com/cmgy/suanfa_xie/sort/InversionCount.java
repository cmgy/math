package com.cmgy.suanfa_xie.sort;

import org.junit.Assert;
import org.junit.Test;

public class InversionCount extends Example {


    public int count(Comparable[] comparables) {

        int count = 0;
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i + 1; j < comparables.length; j++) {
                if (less(comparables[j], comparables[i])) {
                    count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test01() {
        Integer[] data = new Integer[]{5, 4, 3, 2, 1};

        System.out.println("1="+count(new Integer[]{1}));
        System.out.println("2="+count(new Integer[]{2, 1}));
        System.out.println("3="+count(new Integer[]{3, 2, 1}));
        System.out.println("4="+count(new Integer[]{4, 3, 2, 1}));
        System.out.println("5="+count(new Integer[]{5, 4, 3, 2, 1}));
        System.out.println("6="+count(new Integer[]{6,5, 4, 3, 2, 1}));
        System.out.println("7="+count(new Integer[]{7,6,5, 4, 3, 2, 1}));
        System.out.println("8="+count(new Integer[]{8,7,6,5, 4, 3, 2, 1}));
//        Assert.assertEquals(10,count(data));
    }



}
