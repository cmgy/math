package com.cmgy.sword.list;

import com.cmgy.sword.list.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PrintListTest {



//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        list.add(listNode.val);
//        while (listNode.next != null) {
//            list.add(listNode.next.val);
//            listNode = listNode.next;
//        }
//
//        return list;
//    }




    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode tmp = listNode;
        while(tmp!=null){
            list.add(0,tmp.val);
            tmp = tmp.next;
        }
        return list;
    }

    @Test
    public void test() {
        ListNode node01 = new ListNode(1);
        ListNode node02 = new ListNode(2);
        ListNode node03 = new ListNode(3);
        ListNode node04 = new ListNode(4);
        node01.next=node02;
        node02.next=node03;
        node03.next=node04;

        ArrayList<Integer> list = printListFromTailToHead(node01);

        Assert.assertTrue(list.get(0) == 1);
        Assert.assertTrue(list.get(1) == 2);
        Assert.assertTrue(list.get(2) == 3);
        Assert.assertTrue(list.get(3) == 4);

    }


    @Test
    public void test02() {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(0, 4);

        Assert.assertTrue(list.get(0) == 1);
        Assert.assertTrue(list.get(1) == 2);
        Assert.assertTrue(list.get(2) == 3);
        Assert.assertTrue(list.get(3) == 4);

    }

    @Test
    public void test03() {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0, 4);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);

        Assert.assertTrue(list.get(0) == 1);
        Assert.assertTrue(list.get(1) == 2);
        Assert.assertTrue(list.get(2) == 3);
        Assert.assertTrue(list.get(3) == 4);

    }
}
