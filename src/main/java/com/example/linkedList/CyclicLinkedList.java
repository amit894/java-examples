package com.example.linkedList;

public class CyclicLinkedList {
    Node head;

    private static class Node{
        Node next;
        int val;
        Node (int x){val=x;}
    }

    private boolean containsCycle(){
        Node slow_pointer = head;
        Node fast_pointer = head;

        while (slow_pointer!=null && fast_pointer!=null && fast_pointer.next!=null){
            slow_pointer=slow_pointer.next;
            fast_pointer=fast_pointer.next.next;

            if (slow_pointer==fast_pointer)
                return true;
        }

        return false;

    }

    private void insertAtHead(int val){
        Node node = new Node(val);
        if (head==null){
            head=node;
        }
        else {
            node.next=head;
            head=node;
        }
    }

    public static void main (String [] args){
        CyclicLinkedList c1 = new CyclicLinkedList();
        c1.insertAtHead(4);
        c1.insertAtHead(6);

        System.out.println(c1.containsCycle());
        c1.head.next=c1.head;
        System.out.println(c1.containsCycle());

    }

}
