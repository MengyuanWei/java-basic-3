package com.corejava;

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
}
