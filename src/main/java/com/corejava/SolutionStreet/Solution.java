package com.corejava.SolutionStreet;
//Write a function that accepts a single string input and returns the first non-repeated character.
//        "AABBCDD" // "C"
//        "AABBCCDEEFF" // "D"
public class Solution {

    private char output;

    public char findFirstChar (String input) {

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
                output= input.charAt(i);
                System.out.println("The first char would be: " +input.charAt(i));
                break;
            }
        }
        return output;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        solution.findFirstChar("AAAACBBDD");
    }
}

