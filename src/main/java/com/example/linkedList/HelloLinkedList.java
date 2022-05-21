package com.example.linkedList;

public class HelloLinkedList {

    private static class SingleNode {
        int val;
        SingleNode next;
        SingleNode(int x){val=x;}
    }

    public static void main (String [] args){
        SingleNode s1 = new SingleNode(4);
        SingleNode s2 = new SingleNode(6);
        s1.next=s2;
        System.out.println(s1.val);
        System.out.println(s1.next.val);

    }
}


