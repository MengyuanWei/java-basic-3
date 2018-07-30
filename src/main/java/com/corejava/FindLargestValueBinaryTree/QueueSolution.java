package com.corejava.FindLargestValueBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueSolution {
    public List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        while(!(queue.isEmpty())){
            int temp = 0;
            int size = queue.size();
            for(int i =0;i < size;i++){
                TreeNode node = queue.poll();
                    if(node.val>=temp){
                    temp = node.val;
                    }
                    if(!(node.left == null)){
                    queue.offer(node.left);
                    }
                    if(!(node.right == null)){
                    queue.offer(node.right);
                    }
            }
            list.add(temp);
        }
        System.out.println(list);
        return list;
    }





    public static void main(String[] arg){
        QueueSolution queueSolution = new QueueSolution();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(5);
        left.right= new TreeNode(3);
        right.right=new TreeNode(9);
        queueSolution.largestValues(root);
    }
}
