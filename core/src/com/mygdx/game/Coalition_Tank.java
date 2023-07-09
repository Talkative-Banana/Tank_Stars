package com.mygdx.game;

import java.util.ArrayList;

public class Coalition_Tank extends Tank implements Tank_Interface{

    private ArrayList<Weapons> weapons;

    public Coalition_Tank(float position_y, float position_x) {
        super(position_y,position_x);
        weapons = new ArrayList<>();
        this.setHealth(2000);
    }

    @Override
    public void move() {

    }

    @Override
    public void rotate_shooter() {

    }

    @Override
    public void shoot() {

    }

    @Override
    public void choose_weapon() {

    }
}
