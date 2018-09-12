package com.corejava;

import com.corejava.FindLargestValueBinaryTree.TreeNode;

import java.util.LinkedList;

public class TraverseLinkedList {
    Node head;
    private int count=0;
    static class Node{
        int data;
        Node next;
        Node(int b){
            data = b;
            next=null;
        }
    static class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
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

    public void traveseTreeNode(TreeNode node, int count){
        if(node.left!=null){
            traveseTreeNode(node.left,count++);
        }
        if(node.right!=null) {
            traveseTreeNode(node.right,count++);
        }
    }
}