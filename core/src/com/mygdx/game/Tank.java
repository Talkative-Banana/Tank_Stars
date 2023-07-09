package com.mygdx.game;

import java.io.Serializable;

public class Tank implements Tank_Interface, Serializable {

    private float Health;
    private float Position_x;
    private float Position_y;

    public float getHealth() {return Health;}
    public void setHealth(float health) {Health = health;}

    public float getPosition_x() {return Position_x;}
    public void setPosition_x(float position_x) {Position_x = position_x;}

    public float getPosition_y() {return Position_y;}
    public void setPosition_y(float position_y) {Position_y = position_y;}

    public Tank(float position_y) {
        Position_y = position_y;
    }
    public Tank(float position_y, float position_x) {
        Position_y = position_y;
        Position_x = position_x;
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
