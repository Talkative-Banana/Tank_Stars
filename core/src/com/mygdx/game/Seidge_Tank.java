package com.mygdx.game;

import com.mygdx.game.Tank;

import java.util.ArrayList;

public class Seidge_Tank extends Tank implements Tank_Interface{

    private ArrayList<Weapons> weapons;
    public Seidge_Tank(float position_y,float position_x) {
        super(position_y);
        weapons = new ArrayList<>();
        this.setHealth(500);
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
