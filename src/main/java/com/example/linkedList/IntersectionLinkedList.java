package com.example.linkedList;

import java.util.HashSet;

public class IntersectionLinkedList {
    Node head;
    private static class Node {
        Node next;
        int value;
        Node (int x){value=x;}
    }

    private void insertAtHead (int value){
        Node node= new Node(value);
        if (head!=null){
            node.next=head;
        }
        head=node;
    }

    private void printList (){
        Node current_node = head;
        while (current_node!=null){
            System.out.println(current_node.value);
            current_node=current_node.next;
        }
    }

    private static Node intersectionList(IntersectionLinkedList list1, IntersectionLinkedList list2){
        HashSet<Node> set = new HashSet<>();
        Node current_node = list1.head;
        while(current_node!=null){
            set.add(current_node);
            current_node=current_node.next;
        }
        current_node=list2.head;
        while (current_node!=null){
            if (set.contains(current_node))
                return current_node;
            current_node=current_node.next;
        }

        return null;
    }
    public static void main (String[] args){
        IntersectionLinkedList list_1 = new IntersectionLinkedList();
        IntersectionLinkedList list_2 = new IntersectionLinkedList();
        list_1.insertAtHead(6);
        list_1.insertAtHead(7);

        list_2.insertAtHead(6);
        list_2.insertAtHead(7);

        System.out.println(intersectionList(list_1,list_2));

    }
}
