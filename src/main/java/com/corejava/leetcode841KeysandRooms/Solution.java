package com.corejava.leetcode841KeysandRooms;

import java.util.List;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean finish = false;
        for(int i =0;i<rooms.size();i++){
           for(int j = 0; j<rooms.get(i).size();j++){

               if((i+1) == rooms.get(i).get(j)){
                   finish = true;
               }
               else{
                   finish = false;
               }
           }
        }
    return finish;
    }
}
