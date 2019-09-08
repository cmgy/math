package com.cmgy.sword.stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/*定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））*/
public class Solution14 {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> indexStack = new Stack<>();

    public void push(int node) {
        if (indexStack.empty()) {
            indexStack.push(node);
        } else if (node < indexStack.peek()) {
            indexStack.push(node);

        }
        s.push(node);
    }

    public void pop() {
        int i = s.pop();
        if (i == indexStack.peek()) {
            indexStack.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return indexStack.peek();
    }


    @Test
    public void test01() {
        Solution14 s = new Solution14();

        s.push(5);
        s.push(4);
        s.push(3);
        s.push(8);
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(1);

        Assert.assertEquals(1, s.min());
        s.pop();
        Assert.assertEquals(3, s.min());
        s.pop();
        Assert.assertEquals(3, s.min());
        s.pop();
        Assert.assertEquals(3, s.min());
        s.pop();
        Assert.assertEquals(3, s.min());
        s.pop();
        Assert.assertEquals(3, s.min());
        s.pop();
        Assert.assertEquals(4, s.min());

    }

}
