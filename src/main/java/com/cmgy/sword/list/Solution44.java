package com.cmgy.sword.list;


import com.cmgy.sword.list.ListNode;
import org.junit.Assert;
import org.junit.Test;

/*输入一个链表，反转链表后，输出新链表的表头。*/
public class Solution44 {


    /*思路:将链表分成两部分，一部分已逆转，用head作为头节点，
    一部分剩余链，以rest为头节点；以current作为中介转换的变量*/
    public ListNode ReverseList(ListNode head) {


        ListNode rest = head;
        head = null;

        while (rest != null) {
            ListNode current = rest;
            rest = rest.next;
            current.next = head;
            head = current;
        }
        return head;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(6);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(1);

        ListNode newHead = ReverseList(head);
        Assert.assertEquals(1,newHead.val);
        Assert.assertEquals(9,newHead.next.val);
        Assert.assertEquals(4,newHead.next.next.val);
        Assert.assertEquals(2,newHead.next.next.next.val);
        Assert.assertEquals(6,newHead.next.next.next.next.val);


    }
}
