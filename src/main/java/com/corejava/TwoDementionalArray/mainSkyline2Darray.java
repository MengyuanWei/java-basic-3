package com.corejava.TwoDementionalArray;

import com.corejava.TwoDementionalArray.Java2dArray;

public class mainSkyline2Darray {
    public static void main (String[] args){
        Java2dArray java2dArray = new Java2dArray();
        int [][] result = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
               };
        java2dArray.maxIncreaseKeepingSkyline(result);
    }
}
