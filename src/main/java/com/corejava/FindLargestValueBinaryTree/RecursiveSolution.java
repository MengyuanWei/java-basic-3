package com.corejava.FindLargestValueBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution {
    private List<Integer> maxValueList = new ArrayList<>();

    public List<TreeNode> largestValues(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        largestValuesR(nodeList);
        return nodeList;
    }

    public List<Integer> largestValuesR(List<TreeNode> nodeList) {
        List<TreeNode> next = new ArrayList<>();

        for(TreeNode node : nodeList){
            if(!(node.left == null) ) {
                next.add(node.left);
            }
            if(!(node.right ==null)){
                next.add(node.right);
            }
        }
        if(next.isEmpty()){
            return null;
        }

        maxValueList.add(maxValue(next));
        largestValuesR(next);
        System.out.println(maxValueList);
        return maxValueList;
    }

    public int maxValue(List<TreeNode> nodeList){
        int temp = 0;
        for(int i =0;i<nodeList.size();i++){
            if(temp<=nodeList.get(i).val){
                temp = nodeList.get(i).val;
            }
        }
        return temp;
    }

    public static void main(String[] arg){
        RecursiveSolution recursiveSolution = new RecursiveSolution();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(5);
        left.right= new TreeNode(3);
        right.right=new TreeNode(9);
        recursiveSolution.largestValues(root);
    }
}