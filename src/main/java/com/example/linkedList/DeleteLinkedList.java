package com.example.linkedList;



public class DeleteLinkedList {
    Node head;

    private class Node{
        int val;
        Node next;
        Node (int num){val=num;}
    }

    public void deleteNode(int val){
        Node current_node = head;
        Node prev_node = null;

        if (head.val==val){
            head=head.next;
            return;
        }

        while (current_node!=null && current_node.val!=val){
            prev_node=current_node;
            current_node=current_node.next;
        }

        if (current_node==null){
            return;
        }

        prev_node.next=current_node.next;

    }

    public void print_list(){
        Node current_node = head;
        while (current_node!=null)
        {
            System.out.println(current_node.val);
            current_node=current_node.next;
        }
    }

    public void insertatHead(int val){
        Node node = new Node(val);
        if (head!=null){
            node.next=head;
        }
        head=node;
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
