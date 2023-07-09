package com.mygdx.game;

public class Basic {
    private Player p1;
    private Player p2;

    private void allot_tank(Player player, int Tank_Name1, Tank tank){
        if(Tank_Name1 == 0){
            player.setMy_tank(new Coalition_Tank(tank.getPosition_y(), tank.getPosition_x()));
        } else if (Tank_Name1 == 1) {
            player.setMy_tank(new Rocket_Tank(tank.getPosition_y(), tank.getPosition_x()));
        } else if(Tank_Name1 == 2){
            player.setMy_tank(new Seidge_Tank(tank.getPosition_y(), tank.getPosition_x()));
        } else {
            System.out.println("Error");
        }
    }

    public Player getP1() {
        return p1;
    }
    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }
    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public Basic(String Name_1, String Name_2 , int Tank_Name1, int Tank_Name2){
        // setting all attributes for player 1 and player 2
        this.p1 = new Player(Name_1);
        this.p2 = new Player(Name_2);
        // setting ids for p1 and p2
        p1.setID(1);
        p2.setID(2);
        // setting points for p1 and p2
        p1.setPoints(0);
        p2.setPoints(0);
        // setting tanks for p1 and p2
        p1.setMy_tank(new Tank(100));
        p1.setMy_tank(new Tank(100));
        allot_tank(p1,Tank_Name1,p1.getMy_tank());
        allot_tank(p2,Tank_Name2,p2.getMy_tank());

        p1.getMy_tank().setPosition_x(50);
        p2.getMy_tank().setPosition_x(500);
    }
}
