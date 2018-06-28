package com.javapractice.interfacePractice;


public class TestInterfaceClass {
    public static void main (String[] args)
    {
        Kar98 kar98 = new Kar98();
        System.out.println("The shape/type of the gun is " + kar98.shape()+ ", Bullet: " + kar98.bulletNumber() +", Slogen: " + kar98.slogen());
    }
}
