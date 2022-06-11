package com.example.linkedList;

public class AddLinkedList {
    ListNode head;

    private static class ListNode {
        int val;
        ListNode next;
        ListNode (int x){val=x;}
    }

    private void insertAtHead(int val){
        ListNode new_node= new ListNode(val);
        if (head!=null){
            new_node.next=head;
        }
        head=new_node;

    }

    private void print_list(){
        ListNode current_node=head;
        while (current_node!=null){
            System.out.println(current_node.val);
            current_node=current_node.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode current_node_1=l1;
        ListNode current_node_2=l2;
        ListNode dummyhead= new ListNode(0);
        ListNode current_node_3=dummyhead;
        while(current_node_1!=null || current_node_2!=null){
            int digit_1=0;
            int digit_2=0;
            if (current_node_1!=null)
                digit_1=current_node_1.val;
            if (current_node_2!=null)
                digit_2=current_node_2.val;
            int digit_sum=(carry+digit_1+digit_2)%10;
            carry=(carry+digit_1+digit_2)/10;
            current_node_3.next=new ListNode(digit_sum);
            if (current_node_1!=null)
                current_node_1=current_node_1.next;
            if (current_node_2!=null)
                current_node_2=current_node_2.next;
            current_node_3=current_node_3.next;

        }

        if (carry==1)
            current_node_3.next=new ListNode(1);

        return dummyhead.next;
    }

    public static void main (String [] args){
        AddLinkedList l1= new AddLinkedList();
        AddLinkedList l2= new AddLinkedList();
        l1.insertAtHead(9);
        l1.insertAtHead(9);
        l2.insertAtHead(9);
        AddLinkedList l3= new AddLinkedList();
        l3.head=addTwoNumbers(l1.head,l2.head);
        l3.print_list();


    }
}
