package com.company;

public final class Father extends BasketPlayer implements PrintInfo {

    public Father(int age, String teamName, TypesOFPlayer typesOFPlayer, String name) {
        super(age, teamName, typesOFPlayer, name);
    }


    public void BaskPlayer(int height, String name){
        super.BaskPlayer(33,"Kanat");

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Empty");
    }
}
