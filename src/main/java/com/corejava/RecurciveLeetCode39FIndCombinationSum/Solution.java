package com.corejava.RecurciveLeetCode39FIndCombinationSum;

//Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
// find all unique combinations in candidates where the candidate numbers sums to target.
//
//        The same repeated number may be chosen from candidates unlimited number of times.
//
//        Note:
//
//        All numbers (including target) will be positive integers.
//        The solution set must not contain duplicate combinations.

//Input: candidates = [2,3,6,7], target = 7,
//        A solution set is:
//        [
//        [7],
//        [2,2,3]
//        ]

public class Solution {

    private int value = 0;
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] numArray = new int[] {2,4,6,10,8};
        System.out.println("Total possible combination is "+solution.rec(18,numArray,4));

    }

    public int rec(int total, int [] numArray,int start){

        if(total==0){
            return 1;
        } else if(start < 0){
            return 0;
        }
        else if(total<numArray[start]){
            return rec(total,numArray,start-1);
        }
        else{
            int val = rec(total-numArray[start],numArray,start-1);
            int va2 = rec(total,numArray,start-1);
            return val+va2;
        }
    }
}
