package com.example.linkedList;

public class ReverseLinkedList {
    Node head;
    private class Node {
        int value;
        Node next;
        Node (int x){value=x;}
    }

    private void insertAtHead(int value){
        Node node = new Node(value);
        if (head!=null)
            node.next=head;
        head=node;
    }

    private void print_list(){
        Node current_node=head;
        while (current_node!=null){
            System.out.println(current_node.value);
            current_node=current_node.next;
        }
    }

    private Node reverse_list (Node head){
        Node current_node = head;
        Node prev_node =null;
        while (current_node!=null){
            Node temp_next=current_node.next;
            current_node.next=prev_node;
            prev_node=current_node;
            current_node=temp_next;
        }
        return prev_node;
    }

    public static void main (String [] args){
        ReverseLinkedList list = new ReverseLinkedList();
        list.insertAtHead(5);
        list.insertAtHead(4);
        list.insertAtHead(3);
        list.print_list();
        System.out.println("De limiter");
        list.head=list.reverse_list(list.head);
        list.print_list();
    }
}
