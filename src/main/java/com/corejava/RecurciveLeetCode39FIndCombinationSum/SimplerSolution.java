package com.corejava.RecurciveLeetCode39FIndCombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplerSolution {
    private int count =0;
    public static void main(String[] args){
        SimplerSolution simplerSolution = new SimplerSolution();
        int[] numArray = new int[] {2,6,4,10};
        Arrays.sort(numArray);
        List<List<Integer>> results = new ArrayList<>();
        System.out.println(simplerSolution.rec(numArray,16,0,results,new ArrayList<>()));
    }

    public List<List<Integer>> rec(int[] numArray, int target, int index, List<List<Integer>> results, List<Integer> currentSq){
        if(target == 0){
            results.add(new ArrayList<>(currentSq));
            count ++;
        }
        else if(target>0){
            for(int i = index;i<numArray.length;i++){
                if(numArray[index]>target) break;
                currentSq.add(numArray[i]);
                rec(numArray,target-numArray[i],i,results,currentSq);
                currentSq.remove(currentSq.size()-1);
            }
        }
        return results;
    }
}
