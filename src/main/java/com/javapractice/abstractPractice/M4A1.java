package com.javapractice.abstractPractice;


public class M4A1 extends Ar {
    private String m4A1 = "M4A1";
    private Integer bullet;

    @Override
    public String getGunName()
    {
        return m4A1;
    }

    @Override
    public Integer getGunBullet(Integer bullet){
        this.bullet = bullet;
        return bullet;
    }


}
