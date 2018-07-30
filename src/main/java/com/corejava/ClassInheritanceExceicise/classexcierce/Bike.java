package com.corejava.ClassInheritanceExceicise.classexcierce;

public class Bike {

    public String wheelShape ;
    public int wheelNum;
    public String seatShape;
    public String className = this.getClass().getName();
    // One constructor
    public Bike(String wheelShape, int wheelNum, String seatShape)
    {
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
    }



    // 1 method

    public void print(){

        System.out.println(className + "'s Wheel shape is : " + wheelShape);
        System.out.println(className + "'s Wheel number is : "+ wheelNum);
        System.out.println(className + "'s Seat shape is : " + seatShape);

    }
}