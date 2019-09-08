package com.cmgy.sword.fabonaci;

import org.junit.Assert;
import org.junit.Test;

public class JumpFloorCrazyTest {

    public int JumpFloorII(int target) {
        if (target == 0 || target == 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= target; i++) {
            sum += JumpFloorII(target - i);
        }
        return sum;
    }

    @Test
    public void test01() {
        Assert.assertEquals(1, JumpFloorII(0));
        Assert.assertEquals(1, JumpFloorII(1));
        Assert.assertEquals(2, JumpFloorII(2));
        Assert.assertEquals(4, JumpFloorII(3));
        Assert.assertEquals(8, JumpFloorII(4));
        Assert.assertEquals(16, JumpFloorII(5));
    }
}
