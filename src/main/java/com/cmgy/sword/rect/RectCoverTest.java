package com.cmgy.sword.rect;

import org.junit.Assert;
import org.junit.Test;

public class RectCoverTest {

    public int RectCover(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }

        if (target == 2) {
            return 2;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }

    @Test
    public void test01() {
//        Assert.assertEquals(0, RectCover(0));
//        Assert.assertEquals(1, RectCover(1));
        Assert.assertEquals(2, RectCover(2));
        Assert.assertEquals(3, RectCover(3));
        Assert.assertEquals(5, RectCover(4));
        Assert.assertEquals(8, RectCover(5));
    }
}
