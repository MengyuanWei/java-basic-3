
package com.corejava.ClassInheritanceExceicise.classexcierce;

public class Bicycle extends Bike {

    public int pedalNum;

    // constructor
    public Bicycle(int pedalNum,String wheelShape, int wheelNum, String seatShape) {
        super(wheelShape, wheelNum, seatShape);
        this.pedalNum = pedalNum;
    }

    // one method
    public void print() {

        super.print();
        System.out.println(this.getClass().getName() +"'s Pedal number is: " + pedalNum);
    }
}
