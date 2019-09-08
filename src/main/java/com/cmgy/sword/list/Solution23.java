package com.cmgy.sword.list;

import org.junit.Assert;
import org.junit.Test;

/*输入两个单调递增的链表，输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。*/
public class Solution23 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(100);
        ListNode current = head;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                current.next = list2;
                list2 = list2.next;
            }else if (list2 == null) {
                current.next=list1;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                current.next = list2;
                list2 = list2.next;
            }else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }
        return head.next;
    }

    @Test
    public void test01() {
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(6);
        list1.next.next.next.next = new ListNode(8);
        list1.next.next.next.next.next = new ListNode(10);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);
        list2.next.next.next = new ListNode(7);
        list2.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next = new ListNode(11);

        ListNode resultNode = Merge(list1, list2);

        Assert.assertEquals(0, resultNode.val);
        Assert.assertEquals(1, resultNode.next.val);
        Assert.assertEquals(2, resultNode.next.next.val);
        Assert.assertEquals(3, resultNode.next.next.next.val);
        Assert.assertEquals(4, resultNode.next.next.next.next.val);
        Assert.assertEquals(5, resultNode.next.next.next.next.next.val);
        Assert.assertEquals(6, resultNode.next.next.next.next.next.next.val);
        Assert.assertEquals(7, resultNode.next.next.next.next.next.next.next.val);
        Assert.assertEquals(8, resultNode.next.next.next.next.next.next.next.next.val);
        Assert.assertEquals(9, resultNode.next.next.next.next.next.next.next.next.next.val);
        Assert.assertEquals(10, resultNode.next.next.next.next.next.next.next.next.next.next.val);
        Assert.assertEquals(11, resultNode.next.next.next.next.next.next.next.next.next.next.next.val);
    }
}
