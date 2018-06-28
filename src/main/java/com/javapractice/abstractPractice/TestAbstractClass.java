package com.javapractice.abstractPractice;

public class TestAbstractClass {
    public static void main (String[] args)
    {
        M4A1 m4A1 = new M4A1();
        AK47 ak47 = new AK47();
        System.out.println("We have guns like " + m4A1.getGunName()+ " and " + ak47.getGunName());
        System.out.println("M4A1 has " + m4A1.getGunBullet(40).toString() + " Bullets");
        System.out.println("AK47 has " + ak47.getGunBullet(45).toString() + " Bullets");
        System.out.println(ak47.getaK47());
    }
}
