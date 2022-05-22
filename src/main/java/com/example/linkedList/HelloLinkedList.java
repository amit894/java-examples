package com.example.linkedList;

public class HelloLinkedList {
    private static class SingleNode {
        int val;
        SingleNode( int x){val=x;}
        SingleNode next;
    }

    public static void main (String args[]){
        SingleNode N1 = new SingleNode(44);
        SingleNode N2 = new SingleNode(66);
        SingleNode N3 = new SingleNode(88);
        N1.next=N2;
        N2.next=N3;
        System.out.println(N1.val);
        System.out.println(N1.next.val);
        System.out.println(N1.next.next.val);
    }
}


