package com.example.linkedList;

public class LinkedList {

    Node head;

    private class Node {
        int val;
        Node next;
        Node (int x){val=x;}
    }

    private void insert(int val){
        Node node=new Node(val);
        if (head==null)
            head=node;
        else {
            node.next = head;
            head=node;
        }
    }

    private void print_list(Node head){
       Node current_node=head;
       while(current_node!=null){
           System.out.println(current_node.val);
           current_node=current_node.next;
       }
    }


    public static void main (String args[]){
        LinkedList l1 = new LinkedList();
        l1.insert(2);
        l1.insert(22);
        l1.insert(222);
        l1.insert(2222);
        l1.print_list(l1.head);

    }
}
