package com.corejava.BinarySearch;

public class BinarySearch {

    public int binarySearch(int [] array, int start, int end, int number){
        if(end >= start) {
            int mid = start + (end - start) / 2;

            if (array[mid] == number) {
                return mid;
            }
            if (array[mid] > number) {
                return binarySearch(array, start, mid - 1, number);
            }

            if (array[mid] < number) {
                return binarySearch(array, mid + 1, end, number);
            }
        }
        return -1;
    }

    public static void main (String[] args){
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1,3,4,5,8,10};
        int result = binarySearch.binarySearch(array,0,array.length-1,8);
        System.out.println(result);
    }
}
