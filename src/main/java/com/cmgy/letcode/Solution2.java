package com.cmgy.letcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution2 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode(0);
        ListNode rootNode = newNode;

        while ((l1 != null) || (l2 != null)) {

            if (l1 == null) {
                if (newNode.val + l2.val >= 10) {
                    newNode.val = (newNode.val + l2.val) % 10;
                    newNode.next = new ListNode(1);
                } else {
                    newNode.val += l2.val;
                }

                if (l2.next != null && newNode.next == null) {
                    newNode.next = new ListNode(0);
                }

                l2 = l2.next;
                newNode = newNode.next;
                continue;
            } else if (l2 == null) {
                if (newNode.val + l1.val >= 10) {
                    newNode.val = (newNode.val + l1.val) % 10;
                    newNode.next = new ListNode(1);
                } else {
                    newNode.val += l1.val;
                }

                if (l1.next != null && newNode.next == null) {

                    newNode.next = new ListNode(0);
                }

                l1 = l1.next;
                newNode = newNode.next;
                continue;
            }

            if ((l1.next != null) || (l2.next != null)) {
                newNode.next = new ListNode(0);
            }

            if ((l1.val + l2.val + newNode.val) >= 10) {
                newNode.val = (l1.val + l2.val + newNode.val) % 10;
                newNode.next = new ListNode(1);
            } else {
                newNode.val += (l1.val + l2.val);

            }
            l1 = l1.next;
            l2 = l2.next;
            newNode = newNode.next;
        }


        return rootNode;
    }


    @Test
    public void test01() {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(5);

        ListNode resultNode = addTwoNumbers(l1, l2);

        Assert.assertEquals(6, resultNode.val);
        Assert.assertEquals(9, resultNode.next.val);
        Assert.assertEquals(0, resultNode.next.next.val);
        Assert.assertEquals(6, resultNode.next.next.next.val);
    }


    @Test
    public void test02() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(6);

        ListNode l2 = null;

        ListNode resultNode = addTwoNumbers(l1, l2);

        Assert.assertEquals(9, resultNode.val);
        Assert.assertEquals(1, resultNode.next.val);
        Assert.assertEquals(6, resultNode.next.next.val);
    }


    @Test
    public void test03() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode resultNode = addTwoNumbers(l1, l2);

        Assert.assertEquals(7, resultNode.val);
        Assert.assertEquals(0, resultNode.next.val);
        Assert.assertEquals(8, resultNode.next.next.val);
    }

    @Test
    public void test04() {
        ListNode l1 = new ListNode(1);


        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode resultNode = addTwoNumbers(l1, l2);

        Assert.assertEquals(0, resultNode.val);
        Assert.assertEquals(0, resultNode.next.val);
        Assert.assertEquals(1, resultNode.next.next.val);
    }


    @Test
    public void test05() {
        ListNode l1 = new ListNode(1);


        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(8);

        ListNode resultNode = addTwoNumbers(l1, l2);

        Assert.assertEquals(0, resultNode.val);
        Assert.assertEquals(9, resultNode.next.val);
    }
}
