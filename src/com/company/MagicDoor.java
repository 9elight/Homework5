package com.company;

public class MagicDoor {
    public static Object magicDoor(){
        Hero warior = new Hero(200,25,100);
        Hero archer = new Hero(200, 30,60);
        Hero magic = new Hero(150,50,200);
        Hero lich = new Hero(200, 25,70);
        Object[] Heroes = {warior,archer,magic,lich};

        return Heroes;
    }
}
