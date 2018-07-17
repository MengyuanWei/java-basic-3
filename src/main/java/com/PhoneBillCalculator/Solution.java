package com.PhoneBillCalculator;


import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> billStored = new ArrayList<>();
    private List<Integer> timeStored = new ArrayList<>();
    private int time =0;
    private int priviousBill=0;
    private int bill=0;
    private int hour =0;
    private int hour1=0;
    private int hour2=0;
    private int min =0;
    private int min1=0;
    private int min2=0;
    private int sec=0;
    private int sec1=0;
    private int sec2=0;
    public int solution(String S) {
        boolean error = S.isEmpty();
        if(error == true){
            System.out.println("Error, the bill is not vallid");
        }
        else{
            System.out.println("Printing bill for you");
        }

        String billString[] = S.split("\\r\\n|\\n|\\r");
        for(int i = 0;i<billString.length;i++){
          char hourChar1 = billString[i].charAt(0);
          char hourChar2 = billString[i].charAt(1);
          hour1=Integer.parseInt(Character.toString(hourChar1));
          hour2=Integer.parseInt(Character.toString(hourChar2));
          hour = hour1 * 10 + hour2;

          char minChar1 = billString[i].charAt(3);
          char minChar2 = billString[i].charAt(4);
          min1=Integer.parseInt(Character.toString(minChar1));
          min2=Integer.parseInt(Character.toString(minChar2));
          min = min1 * 10 + min2;

          char secChar1 = billString[i].charAt(6);
          char secChar2 = billString[i].charAt(7);
          sec1=Integer.parseInt(Character.toString(secChar1));
          sec2=Integer.parseInt(Character.toString(secChar2));
          sec = sec1 * 10 + sec2;

          if(min < 5)
          {
              bill = (hour*60*60+min*60+sec) *3;
          }
          else if(min>=5)
          {
              if(sec==0) {
                  bill = min * 150;
              }

              if(sec !=0){
                  bill=(min+1)*150;
              }

          }
          billStored.add(bill);
        }

        int max = 0;
        int sum = 0;
        for(Integer bill: billStored){
            sum+=bill;
            if (bill > max) {
                max = bill;
            }
        }

        sum = sum - max;
        System.out.println(sum);

       return sum;
    }
}






