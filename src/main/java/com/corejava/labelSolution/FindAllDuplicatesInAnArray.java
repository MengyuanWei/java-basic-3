package com.corejava.labelSolution;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        int num = 0;
        int count =0;

        while(num < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    count++;
                }
                if (count ==2 ) {
                    dup.add(num);
                    count = 0;
                }
            }
            num++;
        }
        System.out.println(dup);
    return dup;
    }
    public static void main (String[] args){
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray=new FindAllDuplicatesInAnArray();
        int nums[] = {4,4,4,4,2,6,7,8,8,10};
        findAllDuplicatesInAnArray.findDuplicates(nums);

    }
}
