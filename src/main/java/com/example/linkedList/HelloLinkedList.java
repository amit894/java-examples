package com.example.linkedList;

public class HelloLinkedList {

    private static class SingleNode {
        int val;
        SingleNode next;

        SingleNode(int x) {
            val = x;
        }
    }

    public static void main(String args[]) {
        SingleNode h1 = new SingleNode(4);
        System.out.println(h1.val);

    }
}


