package com.example.linkedList;

import java.util.ArrayList;

public class palindromeList {
    Node head;

    private class Node {
        int value;
        Node next;
        Node (int x){value=x;}
    }

    private void insertAtHead(int value){
        Node node = new Node(value);
        if (head!=null){
            node.next=head;
        }
        head=node;
    }

    private void print_list(Node head){
        Node current_node = head;
        while (current_node!=null){
            System.out.println(current_node.value);
            current_node=current_node.next;
        }

    }

    private boolean palindrome_list(Node head){
        Node current_node=head;
        ArrayList<Integer> list = new ArrayList<>();
        while (current_node!=null){
            list.add(current_node.value);
            current_node=current_node.next;
        }
        int left=0;
        int right=list.size()-1;
        while (left<=right){
            if (list.get(left)!=list.get(right))
                return false;
            left+=1;
            right-=1;
        }

        return true;
    }

    public static void main ( String args []){
        palindromeList l1 = new palindromeList();
        palindromeList l2 = new palindromeList();
        l1.insertAtHead(1);
        l1.insertAtHead(2);
        l1.insertAtHead(3);
        System.out.println(l1.palindrome_list(l1.head));
        l2.insertAtHead(1);
        l2.insertAtHead(2);
        l2.insertAtHead(1);
        System.out.println(l2.palindrome_list(l2.head));
    }
}
