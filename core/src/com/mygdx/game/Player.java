package com.mygdx.game;

import java.io.Serializable;

public class Player implements Serializable {
    private int ID;
    private String Name;
    private int points;
    private Tank my_tank;

    public Tank getMy_tank() {
        return my_tank;
    }

    public void setMy_tank(Tank my_tank) {
        this.my_tank = my_tank;
    }

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

    public String getName() {return Name;}
    public void setName(String name) {Name = name;}

    public int getPoints() {return points;}
    public void setPoints(int points) {this.points = points;}

    public Player(String name) {
        Name = name;
        my_tank = new Tank(155);
    }
}
