package com.mygdx.game;

import com.mygdx.game.Tank;

import java.util.ArrayList;

public class Rocket_Tank extends Tank implements Tank_Interface{

    private ArrayList<Weapons> weapons;

    public Rocket_Tank(float position_y, float position_x) {
        super(position_y,position_x);
        weapons = new ArrayList<>();
        this.setHealth(1000);

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
