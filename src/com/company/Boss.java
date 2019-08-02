package com.company;

import java.util.Random;

public class Boss {
    int health;
    int damage;
    int defence;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {

        return defence;
    }

    public void setDefence(int defence) {

        this.defence = defence * changeBossDefence();
    }
    public int changeBossDefence(){
        Random r = new Random();
        int randomDefence = r.nextInt(3) + 1;
        return randomDefence;

    }
}
