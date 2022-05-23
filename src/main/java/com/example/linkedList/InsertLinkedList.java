package com.example.linkedList;

public class InsertLinkedList {
    Node head;

    private class Node {
        Node next;
        int val;
        Node (int x){val=x;}
    }

    private void insertAtHead(int val){
        Node node = new Node(val);
        if  (head!=null){
            node.next=head;
        }
        head=node;
    }

    private void print_list(){
        Node current_node=head;
        while (current_node!=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }

    }



    public static void main (String [] args){
        InsertLinkedList l1 = new InsertLinkedList();
        l1.insertAtHead(4);
        l1.insertAtHead(6);
        l1.insertAtHead(10);
        l1.print_list();
    }


}
