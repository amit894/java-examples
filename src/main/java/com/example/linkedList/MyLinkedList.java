package com.example.linkedList;

public class MyLinkedList {
    Node head;

    private class Node{
        Node next;
        int val;
        Node(int x){val=x;}

    }

    public MyLinkedList() {

    }

    public int get(int index) {
        Node current_node=head;
        int count=1;

        while(count<index && current_node!=null ){
            current_node=current_node.next;
        }

        if (current_node==null)
            return -1;

        return (current_node.next.val);


    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head==null)
            head=node;
        else{
            node.next=head;
            head=node;
        }

    }

    public void addAtTail(int val) {
        Node current_node=head;
        Node node = new Node(val);
        while(current_node.next!=null){
            current_node=current_node.next;
        }
        current_node.next=node;

    }

    public void addAtIndex(int index, int val) {
        Node current_node=head;
        Node node = new Node(val);
        int count=1;

        while(count<index && current_node!=null ){
            current_node=current_node.next;
            count+=1;
        }


        if (current_node==null)
            return;

        node.next=current_node.next;
        current_node.next=node;

    }

    public void deleteAtIndex(int index) {
        Node current_node=head;
        Node prev_node=null;
        int count=1;

        if (count==1){
            head=head.next;
            return;
        }

        while(count<index && current_node!=null ){
            prev_node=current_node;
            count+=1;
            current_node=current_node.next;
        }

        if (current_node==null)
            return;

        prev_node.next=current_node.next;


    }

    private void print_list(Node head){
        Node current_node=head;
        while (current_node!=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }

    }

    public static void main (String [] args){
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(4);
        list.addAtHead(6);
        list.print_list(list.head);
        list.addAtIndex(1,10);
        list.print_list(list.head);

    }
}
