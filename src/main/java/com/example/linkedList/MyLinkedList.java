package com.example.linkedList;

public class MyLinkedList {
    Node head;

    private class Node{
        Node next;
        int val;
        Node (int x){val=x;}
    }

    private MyLinkedList(){

    }

    public int get(int index) {
        Node current_node =head;
        for (int i=0; i<index && current_node!=null;i++){
            current_node=current_node.next;
        }

        if (current_node==null)
            return -1;

        return current_node.val;

    }

    public void addAtHead(int val) {
        Node new_node = new Node(val);
        if (head!=null){
            new_node.next=head;
        }
        head=new_node;
    }

    public void addAtTail(int val) {
        Node new_node = new Node(val);
        Node current_node = head;

        while (current_node.next!=null){
            current_node=current_node.next;
        }

        current_node.next=new_node;

    }

    public void addAtIndex(int index, int val) {
        Node new_node= new Node(val);
        Node current_node= head;
        for (int count=0; count<index && current_node!=null; count++){
            current_node=current_node.next;
        }

        if (current_node==null){
            head=current_node;
            return;

        }

        new_node.next=current_node.next;
        current_node.next=new_node;



    }

    public void deleteAtIndex(int index) {
        Node current_node= head;
        Node prev_node=null;
        for (int count=0; count<index && current_node!=null; count++){
            prev_node=current_node;
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
        list.addAtIndex(0,10);
        list.print_list(list.head);

    }
}
