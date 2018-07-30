package com.corejava.binarytreee;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums,int leftIndex,int rightIndex) {
        if (leftIndex == rightIndex){
            return null;
        }
        int maxIndex = max(nums,leftIndex,rightIndex);
        TreeNode currentNode = new TreeNode(nums[maxIndex]);
        currentNode.left = constructMaximumBinaryTree(nums,leftIndex,maxIndex);
        currentNode.right= constructMaximumBinaryTree(nums,maxIndex+1,rightIndex);
        System.out.println(currentNode.val);
        return currentNode;
    }

    public int max (int[] nums, int start, int end){
        int val =0;
        int index=0;
        for(int i = start; i < end; i++){
            if(val<=nums[i]){
                val = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] nums= {3,2,1,6,0,5,4,8};
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
        maximumBinaryTree.constructMaximumBinaryTree(nums,0,nums.length);
    }

}

