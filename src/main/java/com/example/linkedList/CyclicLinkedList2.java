package com.example.linkedList;

import java.util.HashSet;

public class CyclicLinkedList2 {
    Node head;

    private class Node{
        int val;
        Node next;
        Node (int x){val=x;}
    }

    private void insertAtHead(int val){
        Node new_node= new Node(val);
        if (head!=null){
            new_node.next=head;
        }
        head=new_node;

    }

    private Node containsCycle(){
        HashSet<Node> set = new HashSet<>();
        Node current_node=head;
        while (current_node!=null){
            if (set.contains(current_node))
                return current_node;
            set.add(current_node);
            current_node=current_node.next;
        }
        return null;
    }

    private void print_list(){
        Node current_node=head;
        while (current_node!=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }
    }

    public static void main (String [] args){
        CyclicLinkedList2 c1 = new CyclicLinkedList2();
        c1.insertAtHead(4);
        c1.insertAtHead(6);

        System.out.println(c1.containsCycle());
        c1.head.next=c1.head;
        System.out.println(c1.containsCycle());

    }
}
