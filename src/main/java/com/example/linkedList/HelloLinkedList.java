package com.example.linkedList;


public class HelloLinkedList {
    private static class SingleNode{
        int val;
        SingleNode next;
        SingleNode(int x){val=x;}
    }

    public static void main (String [] args){
        SingleNode N1 = new SingleNode(16);
        SingleNode N2 = new SingleNode(160);
        SingleNode N3 = new SingleNode(1600);
        SingleNode N4 = new SingleNode(16000);

        N1.next=N2;
        N2.next=N3;
        N3.next=N4;

        System.out.println(N1.val);
        System.out.println(N1.next.val);
        System.out.println(N1.next.next.val);
        System.out.println(N1.next.next.next.val);




    }
}


