package com.corejava.JPMorganInterviewPreparation;

public class ReversedLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

   public Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void printList(Node node){
        while(node != null){
            System.out.println(node.data + " ");
            node = node .next;
        }
    }
public static void main(String[] args){
   ReversedLinkedList reversedLinkedList = new ReversedLinkedList();
   reversedLinkedList.head = new Node(15);
   reversedLinkedList.head.next = new Node(10);
   reversedLinkedList.head.next.next = new Node (5);
   reversedLinkedList.head.next.next.next= new Node(0);

   System.out.println("Before Reverse: ");
   reversedLinkedList.printList(head);
   head=reversedLinkedList.reverse(head);
   System.out.println("After Reversed: ");
   reversedLinkedList.printList(head);



}
}
