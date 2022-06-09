package com.example.doublyLinkedList;

public class HelloDoublyLinkedList {
    private static class Node {
        int val;
        Node next;
        Node prev;
        Node (int x){val=x;}
    }

    public static void main (String [] args){
        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);
        N1.next=N2;
        N2.prev=N1;
        N3.prev=N2;
        N2.next=N3;

        System.out.println(N3.prev.prev.val);
        System.out.println(N1.next.next.val);
    }
}
