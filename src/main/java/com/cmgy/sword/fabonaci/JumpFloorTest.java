package com.cmgy.sword.fabonaci;

import org.junit.Assert;
import org.junit.Test;

public class JumpFloorTest {

    public int JumpFloor(int target) {

        if (target == 0 || target == 1) {
            return 1;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    @Test
    public void test01() {
        Assert.assertEquals(1, JumpFloor(0));
        Assert.assertEquals(1, JumpFloor(1));
        Assert.assertEquals(2, JumpFloor(2));
        Assert.assertEquals(3, JumpFloor(3));
        Assert.assertEquals(5, JumpFloor(4));
        Assert.assertEquals(8, JumpFloor(5));
    }
}
