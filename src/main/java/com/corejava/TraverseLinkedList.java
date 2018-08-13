package com.corejava;

import java.util.LinkedList;

public class TraverseLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int b){
            data = b;
            next=null;
        }


        public static void main(String[] args){
            LinkedList<Integer> linkedList= new LinkedList<>();
            TraverseLinkedList traverseLinkedList=new TraverseLinkedList();
            traverseLinkedList.head=new Node(1);
            Node second=new Node(2);
            Node third = new Node(3);
            traverseLinkedList.head.next=second;
            second.next=third;
        }
    }
}
