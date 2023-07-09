package com.mygdx.game;

public class Weapons {
    private float Damage;
    private float Range;


    public Weapons(float damage, float range) {
        Damage = damage;
        Range = range;
    }

    public float getDamage() {
        return Damage;
    }

    public void setDamage(float damage) {Damage = damage;}
    public float getRange() {return Range;}

    public void setRange(float range) {Range = range;}
}
