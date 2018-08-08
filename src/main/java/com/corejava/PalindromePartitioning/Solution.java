package com.corejava.PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        if (s.length() == 1) {
            result.add(new ArrayList<>());
            result.get(0).add(s);
            return result;
        }

        for (List<String> list : partition(s.substring(1))) {
            List<String> append = new ArrayList<>(list);
            append.set(0, s.substring(0, 1) + append.get(0));
            List<String> add = new ArrayList<>(list);
            add.add(0, s.substring(0, 1));
            result.add(append);
            result.add(add);
        }
        return result;
    }
//    private Boolean isPalindrome(String s) {
//       char[]letterArray= s.toCharArray();
//       Boolean judge = false;
//       for(int i=0;i<letterArray.length;i++){
//            if(letterArray[i] == letterArray[letterArray.length-i]){
//                judge = true;
//            }
//            else {
//                judge = false;
//            }
//       }
//        return judge;
//    }

}


