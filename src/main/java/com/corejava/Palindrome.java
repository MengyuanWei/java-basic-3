package com.corejava;

public class Palindrome {
    public static void main(String[] arg){
        String input ="abc";
        int compare =0;
        char checkArray[] = input.toCharArray();
        for(int i =0; i<checkArray.length;i++){
            if(checkArray[i] == checkArray[checkArray.length-i-1]){
                compare++;
            }
        }

        if(compare==input.length()){
            System.out.println("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}
