package com.corejava.labelSolution;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArrayLabelSolution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupp = new ArrayList<>();
        int count;
        int [] numsLabel = new int[nums.length+1];

        for(int i =0; i <nums.length; i++){
            numsLabel[nums[i]]++;
        }

        for(int i =0;i<nums.length+1;i++){
            if(numsLabel[i]>=2){
                count = i;
                dupp.add(count);
            }
        }
       System.out.println(dupp);
        return dupp;
    }

    public static void main (String[] args){
        FindAllDuplicatesInAnArrayLabelSolution findAllDuplicatesInAnArray=new FindAllDuplicatesInAnArrayLabelSolution();
        int nums[] = {4,4,4,4,2,6,7,8,8,10};
        findAllDuplicatesInAnArray.findDuplicates(nums);

    }
}
