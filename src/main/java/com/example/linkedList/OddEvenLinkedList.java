package com.example.linkedList;

public class OddEvenLinkedList {
    Node head;

    private class Node {
        Node next;
        int value;
        Node (int x){value=x;}
    }

    private void insertAtHead(int val){
        Node node = new Node(val);
        if (head!=null)
            node.next=head;
        head=node;
    }

    private void print_list (Node head){
        Node current_node = head;
        while (current_node!=null){
            System.out.println(current_node.value);
            current_node=current_node.next;
        }

    }

    private Node odd_even_list(Node head){
        if (head==null)
            return null;
        Node odd_current_node = head;
        Node even_current_node = head.next;
        Node even_head=even_current_node;

        while (even_current_node!=null && even_current_node.next!=null){
            odd_current_node.next=even_current_node.next;
            odd_current_node=odd_current_node.next;
            even_current_node.next=odd_current_node.next;
            even_current_node=even_current_node.next;
        }
        odd_current_node.next=even_head;
        return head;
    }

    public static void main (String [] args){
        OddEvenLinkedList list = new OddEvenLinkedList();
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(7);

        list.head=list.odd_even_list(list.head);
        list.print_list(list.head);
    }
}
