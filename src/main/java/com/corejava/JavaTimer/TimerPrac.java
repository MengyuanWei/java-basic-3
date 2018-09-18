package com.corejava.JavaTimer;

import java.util.ArrayList;
import java.util.List;

public class TimerPrac {
    private Thread thread = new Thread();
    private List<Integer> outputList = new ArrayList<>();
    public static void main(String[] args) {
        TimerPrac timerPrac = new TimerPrac();
        try{
            timerPrac.count(5);
        }
        catch (Exception e){
           System.out.println(e);
        }
    }

    public void count(int a) throws InterruptedException{
        for( int i =a;i>=0;i--){
            System.out.println(i);
            //outputList.add(i);
            thread.sleep(5000/a);
        }
    }

}
