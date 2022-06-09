package com.example.doublyLinkedList;

public class MyDoublyLinkedList {
    Node head;
    Node tail;

    private class Node {
        int val;
        Node next;
        Node prev;
        Node ( int x){val=x;}
    }

    private void addAtHead(int val){
        Node node = new Node(val);
        if (head==null){
            tail=node;
        }
        else{
            node.next=head;
            head.prev=node;
        }
        head=node;
    }

    private void addAtTail(int val){
        Node node = new Node(val);
        if (tail==null){
            head=node;
        }
        else{
            tail.next=node;
            node.prev=tail;

        }
        tail=node;
    }

    private int getAtIndex(int index){
        Node current_node=head;
        for (int i=0; i<index && current_node!=null; i++){
            current_node=current_node.next;
        }
        if (current_node==null)
            return -1;

        return current_node.val;

    }

    private void addAtIndex(int index,int val){
        Node current_node=head;
        Node node = new Node(val);
        for (int i=0; i<index && current_node!=null; i++){
            current_node=current_node.next;
        }
        if (current_node==null)
            return;

        node.next=current_node.next;
        node.prev=current_node;
        if (current_node.next!=null){
            current_node.next.prev=node;
            current_node.next=node;
        }

    }

    private void deleteAtIndex(int index){
        Node current_node=head;
        Node prev_node=null;
        for (int i=0; i<index && current_node!=null; i++){
            prev_node=current_node;
            current_node=current_node.next;
        }
        if (current_node==null)
            return;


        if (current_node.next!=null){
            prev_node.next=current_node.next;
            current_node.next.prev=prev_node;
        }

    }

    private void print_list(){
        Node current_node=head;
        while (current_node!=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }
    }

    public static void main (String [] args){
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.addAtHead(5);
        list.addAtHead(4);
        list.addAtTail(6);
        list.print_list();

    }
}
