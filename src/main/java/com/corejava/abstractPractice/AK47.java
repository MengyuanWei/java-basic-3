package com.corejava.abstractPractice;

public class AK47 extends Ar {

    private String aK47 = " AK 47";
    private Integer bullet ;
    private String aK47Best;
    public String getGunName()
    {
        return aK47;
    }

    public Integer getGunBullet(Integer bullet)
    {
        this.bullet=bullet;
        return bullet;
    }

    @Override
    public String getaK47()
    {
        super.getaK47();
        aK47Best = "No, AK 47 is the best gun made ever";
        return aK47Best;

    }
}
