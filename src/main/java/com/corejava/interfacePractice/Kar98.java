package com.corejava.interfacePractice;

import com.corejava.interfacePractice.Gun;

public class Kar98 implements Gun {
    private String gunShape = "Sniper";
    private Integer bulletNumber = 10;
    private String slogenKar98 = "Best sniper ever made";
    public String shape()
    {
        return gunShape;
    }

    public Integer bulletNumber(){

        return bulletNumber;
    }

    public String slogen(){

        return slogenKar98;

    }

}
