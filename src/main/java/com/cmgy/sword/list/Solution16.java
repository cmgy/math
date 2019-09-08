package com.cmgy.sword.list;

import org.junit.Test;

/*输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）*/
public class Solution16 {


    public RandomListNode Clone(RandomListNode pHead) {

        RandomListNode current = pHead;
        RandomListNode newHead = new RandomListNode(Integer.MAX_VALUE);
        RandomListNode newList = newHead;
        copy(pHead);
        copy2(pHead);


        while (current != null && current.next != null) {

            RandomListNode tmp = current.next;
            current.next = tmp.next;
            current = current.next;

            newList.next = tmp;
            newList = newList.next;

        }
        return newHead.next;

    }


    public void copy(RandomListNode pHead) {

        RandomListNode current = pHead;
        while (current != null) {

            RandomListNode copyNode = new RandomListNode(current.label);
            copyNode.next = current.next;
            current.next = copyNode;
            current = current.next.next;
        }

    }



    public void copy2(RandomListNode pHead) {

        int i = 1;
        while (pHead != null && pHead.random != null) {

            if (i % 2 != 0) {
                pHead.next.random = pHead.random.next;
            }
            i++;
            pHead = pHead.next;
        }
    }




    @Test
    public void test01() {

        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.next.next = new RandomListNode(3);
        head.next.next.next = new RandomListNode(4);

        head.random = head.next.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head.next.next.next;

        RandomListNode newHead = Clone(head);


    }
}
