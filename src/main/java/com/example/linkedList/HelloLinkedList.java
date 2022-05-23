package com.example.linkedList;


public class HelloLinkedList {

    private static class Node {
        Node next;
        int val;
        Node (int x){val=x;}
    }


    public static void main (String [] args){
        Node N1 = new Node(4);
        Node N2 = new Node(40);
        Node N3 = new Node(400);
        Node N4 = new Node(4000);

        N1.next=N2;
        N2.next=N3;
        N3.next=N4;

        System.out.println(N1.val);
        System.out.println(N1.next.val);
        System.out.println(N1.next.next.val);
        System.out.println(N1.next.next.next.val);



    }



}


