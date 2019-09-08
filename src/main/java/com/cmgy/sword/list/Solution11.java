package com.cmgy.sword.list;

import com.cmgy.sword.list.ListNode;
import org.junit.Assert;
import org.junit.Test;

/*输入一个链表，输出该链表中倒数第k个结点。*/
public class Solution11 {



    public ListNode FindKthToTail(ListNode head, int k) {

        ListNode listNode=head;
        int length=0;
        if (head != null) {
            length = 1;
            while (listNode.next != null) {
                listNode = listNode.next;
                length++;
            }
        }


        int target = length - k + 1;

        ListNode currentNode=head;
        int current = 1;
        while (current != target && currentNode != null) {

            current++;
            currentNode = currentNode.next;
        }
        return currentNode;
    }


    @Test
    public void test() {
        ListNode head = new ListNode(6);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(1);

        Assert.assertEquals(1,FindKthToTail(head,1).val);
        Assert.assertEquals(9,FindKthToTail(head,2).val);
        Assert.assertEquals(4,FindKthToTail(head,3).val);
        Assert.assertEquals(2,FindKthToTail(head,4).val);
        Assert.assertEquals(6,FindKthToTail(head,5).val);

    }
}
