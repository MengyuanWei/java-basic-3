package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArrayLabelSolution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupp = new ArrayList<>();
        int count = 0 ;
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
}
