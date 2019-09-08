package com.cmgy.sword.stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/*用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。*/
public class Solution5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size() == 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    @Test
    public void test01() {
        Solution5 queue = new Solution5();

        queue.push(3);
        queue.push(9);
        queue.push(1);

        Assert.assertEquals(3,queue.pop());
        Assert.assertEquals(9,queue.pop());
        Assert.assertEquals(1,queue.pop());
    }
}
