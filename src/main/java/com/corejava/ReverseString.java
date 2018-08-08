package com.corejava;

public class ReverseString {

    public static void main(String[] reverseString){
        String input = "1234567";
        String reverse = "";
        for(int i =input.length()-1;i>=0;i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Original string is: " +input);
        System.out.println("Reversed string is: "+ reverse);
    }
}

