package com.cmgy.suanfa_xie.baseContruct;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public int size = 0;
    public static class Node{
        public Node(int v) {
            this.v = v;
        }
        public Node p;
        public Node left;
        public Node right;
        public int v;

    }

    private Node head;

    public Tree(Node node) {
        head = node;
        size++;
    }
    public void add(Node node) {
        Node current = head;

        Node before = null;
        while (current != null) {
            if (node.v > current.v) {
                if (current.right == null) {
                    node.p = current;
                    current.right = node;
                    size++;
                    break;
                }else {
                    current = current.right;
                }
            }else {
                if (current.left == null) {
                    node.p = current;
                    current.left = node;
                    size++;
                    break;
                }else {
                    current = current.left;
                }
            }
        }
    }

    private List<Integer> getFrontArray(Tree tree) {
        Node head = tree.head;
        List<Integer> result = new ArrayList<>();

        printFrontArray(head, result);
        return result;
    }

    private void printFrontArray(Node node,List<Integer> result) {

        if (node == null) {
            return;
        }

        printFrontArray(node.left,result);
        result.add(node.v);
        printFrontArray(node.right,result);

    }
    private void printFrontArray(Node node) {

        if (node == null) {
            return;
        }

        printFrontArray(node.left);
        System.out.println(node.v);
        printFrontArray(node.right);

    }


    public void rightRotate(Tree tree) {
        Node oldHead = tree.head;
        Node newHead = tree.head.left;

        newHead.p = null;

        tree.head = newHead;
        tree.add(oldHead);
    }


    @Test
    public void test01() {

        Tree tree = new Tree(new Node(7));
        tree.add(new Node(3));
        tree.add(new Node(5));
        tree.add(new Node(8));


        rightRotate(tree);
    }
}
