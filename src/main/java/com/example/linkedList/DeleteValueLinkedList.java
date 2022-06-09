package com.example.linkedList;

public class DeleteValueLinkedList {
    Node head;

    private class Node {
        Node next;
        int value;
        Node (int x){value=x;}
    }

    private void insertAtHead(int val){
        Node node = new Node(val);
        if (head!=null){
            node.next=head;
        }
        head=node;
    }

    private void print_list(Node head){
        Node current_node=head;
        while (current_node!=null){
            System.out.println(current_node.value);
            current_node=current_node.next;
        }
    }

    private Node delete_value_node (Node head, int val){
        Node current_node=head;
        Node prev_node=null;

        while (current_node!=null){
            if ( current_node.value==val)
                if (prev_node!=null)
                    prev_node.next=current_node.next;
                else
                    head=current_node.next;
            else
                prev_node=current_node;
            current_node=current_node.next;
        }

        return head;

    }

    public static void main (String [] args){
        DeleteValueLinkedList d1 = new DeleteValueLinkedList();
        d1.insertAtHead(7);
        d1.insertAtHead(7);
        d1.insertAtHead(7);
        d1.insertAtHead(7);
        d1.print_list(d1.head);
        d1.head=d1.delete_value_node(d1.head,7);
        System.out.println("delimiter");
        d1.print_list(d1.head);

    }
}
