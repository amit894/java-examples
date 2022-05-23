package com.example.linkedList;

import java.util.Currency;
import java.util.LinkedList;

public class DeleteLinkedList {
    Node head;

    private class Node {
        Node next;
        int val;
        Node (int x){val=x;}
    }

    private void insertatHead(int val){
        Node node = new Node(val);
        if (head!=null){
            node.next=head;
        }
        head=node;
    }

    private void print_list(){
        Node current_node = head;
        while (current_node !=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }
    }

    private void deleteNode(int key){
        Node current_node = head;
        Node prev_node = null;

        if (head.val==key){
            head=head.next;
            return;
        }

        while (current_node!=null && current_node.val!=key){
            prev_node=current_node;
            current_node=current_node.next;
        }

        if (current_node==null)
            return;

        prev_node.next=current_node.next;

    }

    public static void main (String [] args){
        DeleteLinkedList l1 = new DeleteLinkedList();
        l1.insertatHead(4);
        l1.insertatHead(6);
        l1.insertatHead(10);
        l1.print_list();
        l1.deleteNode(4);
        l1.deleteNode(6);
        l1.print_list();

    }
}
