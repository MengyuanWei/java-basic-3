package com.corejava.TwoSum;

import java.util.Arrays;
import java.util.HashMap;


public class Solution {
    public int [] compare(int[] nums,int target){
        int [] result = new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<nums.length;i++){

            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args){
        int [] nums={2,7,4,9};
        Solution solution =new Solution();
        solution.compare(nums,9);
    }
}
