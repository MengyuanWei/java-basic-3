package com.corejava.abstractPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class Ar {

    private String aK47 = "M4A1 is the best gun ever made";
    private double aK47Bullet = 40;

    abstract public String getGunName();
    abstract public Integer getGunBullet(Integer bullet);

    public String getaK47()
    {
        System.out.println(aK47);
        return aK47;
    }
}
