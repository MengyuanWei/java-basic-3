package com.corejava.JavaTimePacageExcierse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeFlysUsingTimeClass {
    public static void main (String[] args){
        String startDate = "03-15-19";
        String endData = "05-12-19";
        DateTimeFormatter startFormatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        DateTimeFormatter endFormatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        LocalDate startDateTime= LocalDate.parse(startDate,startFormatter);
        LocalDate endDateTime = LocalDate.parse(endData,endFormatter);
        LocalDate compareDate = startDateTime;
        while(compareDate.isBefore(endDateTime)){
        startDateTime.plusDays(7);
        compareDate=compareDate.plusDays(7);
        if(compareDate.isAfter(endDateTime)){
            compareDate=endDateTime;
            System.out.println(startDateTime.toString()+"--"+compareDate.toString()+"\n");
            break;
        }else {
            System.out.println(startDateTime.toString()+"--"+compareDate.toString()+"\n");
        }
        startDateTime = compareDate;
        }
    }
}
