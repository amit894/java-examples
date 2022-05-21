package com.example.linkedList;

public class LinkedList {

    Node head;
    private class Node {
        int val;
        Node next;
        Node (int x){val=x; }
    }

    private void push(int new_data)
    {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    private void print_list(Node head)
    {
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
    }

    public static void main (String args[]){
        LinkedList l1=new LinkedList();
        l1.push(3);
        l1.push(4);
        l1.print_list(l1.head);

    }
}
