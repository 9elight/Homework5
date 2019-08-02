package com.company;

public class MagicDoor {
    public static Object magicDoor(){
        Hero Warior = new Hero(200,25,100);
        Hero Archer = new Hero(200, 30,60);
        Hero Magic = new Hero(150,50,200);
        Hero Lich = new Hero(200, 25,70);
        Object[] Heroes = {Warior,Archer,Magic,Lich};

        return Heroes;
    }
}
