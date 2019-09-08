package com.cmgy.sword.fabonaci;

import org.junit.Assert;
import org.junit.Test;

public class FabonaciTest {

    public int Fibonacci(int n) {

        int seq1 = 0;
        int seq2 = 1;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        for (int i = 0; i < n-2; i++) {
            int sum = seq1 + seq2;
            seq1=seq2;
            seq2=sum;
        }

        return seq1 + seq2;
    }


    public int Fibonacci02(int n) {

        int seq1 = 0;
        int seq2 = 1;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        for (int i = 0; i < n-2; i++) {
            int sum = seq1 + seq2;
            seq1=seq2;
            seq2=sum;
        }

        return seq1 + seq2;
    }

    @Test
    public void test1() {

        Assert.assertEquals(0, Fibonacci(0));
        Assert.assertEquals(1, Fibonacci(1));
        Assert.assertEquals(1, Fibonacci(2));
        Assert.assertEquals(2, Fibonacci(3));
        Assert.assertEquals(3, Fibonacci(4));
    }
}
