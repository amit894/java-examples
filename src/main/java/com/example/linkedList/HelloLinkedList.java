package com.example.linkedList;


public class HelloLinkedList {

  private static class Node {
      int value;
      Node next;
      Node (int k){value=k;}
  }


    public static void main (String [] args){
      Node N1 = new Node(2);
      Node N2 = new Node(3);
      Node N3 = new Node(4);
      N1.next=N2;
      N2.next=N3;
      System.out.println(N1.value);
      System.out.println(N1.next.value);
      System.out.println(N1.next.next.value);

    }



}


