package com.example.linkedList;

public class NodeFromEnd {
    Node head;

    private class Node {
        int value;
        Node next;
        Node (int x){value=x;}
    }

    private void insertNodeAtHead(int val){
        Node node= new Node(val);
        if (head!=null){
            node.next=head;
        }
        head=node;
    }

    private Node ListNodeFromEnd (Node head, int n){
        Node last_node = head;
        for (int i=0; i<n && last_node!=null;i++ ){
            last_node=last_node.next;
        }


        Node current_node=head;
        Node prev_node = null;
        while (last_node!=null){
            prev_node=current_node;
            current_node=current_node.next;
            last_node=last_node.next;
        }

        if (prev_node==null)
            head=current_node.next;
        else
            prev_node.next=current_node.next;

        return head;


    }

    public static void main ( String [] args){

    }
}
