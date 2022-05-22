package com.example.linkedList;

import java.util.LinkedList;

public class DeleteLinkedList {
    Node head;

    private class Node {
        int val;
        Node (int x){val=x;}
        Node next;
    }

    private void print_list(Node head){
        Node current_node= head;
        while (current_node!=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }

    }

    private void insertatHead(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

    }

    private void deleteNode(int key, DeleteLinkedList list){
        Node current_node=list.head;
        Node prev_node= null;

        if (list.head.val==key) {
            list.head = list.head.next;
            System.out.println("Amit");
            System.out.println(list.head.val);
            return;
        }

        while (current_node!=null && current_node.val!=key){
            prev_node=current_node;
            current_node=current_node.next;
        }

        if (prev_node==null){
            return ;
        }

        prev_node.next=current_node.next;


    }

    public static void main (String [] args){
        DeleteLinkedList l1 = new DeleteLinkedList();
        l1.insertatHead(4);
        l1.insertatHead(6);
        l1.insertatHead(10);
        l1.print_list(l1.head);
        l1.deleteNode(4,l1);
        l1.print_list(l1.head);

    }
}
