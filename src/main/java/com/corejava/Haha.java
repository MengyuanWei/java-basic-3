package com.corejava;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

public class Haha {
    public static void main(String [] arg){
        Set<String> set= new SortedSet<>() {
            @Override
            public Comparator comparator() {
                Comparator<String> comparator = new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return 0;
                    }
                };


                return comparator;
//                return null;
            }
        };
    }
}
