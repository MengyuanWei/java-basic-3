package com.corejava.FIndNexrHigherNumberUsingSameDigit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] arg){
        Solution solution = new Solution();
        int input = 38276;
        String inputString = String.valueOf(input);
        int[]numbers=new int[inputString.length()];
        String [] inputArray = inputString.split("");
        int temp =Integer.MIN_VALUE;
        int temp2 = numbers[numbers.length-1];
        int value=0;
        int temp3;
        int []swapArray=new int[5];
        List<Integer> numberList = new ArrayList<>();

        for(int i =0; i<inputArray.length;i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        for(int i = numbers.length-1;i>=0;i--){
            if(numbers[i]<temp){
                value =i;
                break;
            }
            temp = numbers[i];
        }

        for(int i =value+1;i<numbers.length;i++){
            if(numbers[value]<numbers[i]){
                temp3=numbers[i];
                numberList.add(temp3);
            }
        }

        for(int i = numberList.size()-1; i<numberList.size();i++) {
            if (numberList.get(i)<=temp2){

            }
        }

        for(int i = 0;i<numbers.length;i++){
            System.out.println(swapArray[i]);
        }
    }

    public int[] swap(int a,int b){
        int [] swapArray=new int[5];
        int temp = a;
        a=b;
        b = temp;
        swapArray[0]=a;
        swapArray[1]=b;
        return swapArray;
    }

    public int[] sort(int[] a){

        return a;
    }
}
