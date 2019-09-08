package com.cmgy.sword.string;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class StringSpaceTest {

    public String replaceSpace(StringBuffer str) {
        String ss = str.toString();
        return ss.replaceAll(" ", "%20");
    }


    @Test
    public void test01() {
        Assert.assertEquals("we%20are%20hero",replaceSpace(new StringBuffer("we are hero")));
    }
}
