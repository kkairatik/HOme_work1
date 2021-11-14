package com.company;



public class BasketPlayer extends Player implements PrintInfo {
    private String name;
    private int height;
    private String hobby;

    public BasketPlayer(int age, String teamName, TypesOFPlayer typesOFPlayer, String name) {
        super(age, teamName, typesOFPlayer, name);
    }


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getHobby() {
        return hobby;
    }

    public void BaskPlayer(int height, String name) {
        System.out.println("Рост: " + height +
                "\n Имя: " + name);
    }

    public static void BaskPlayer(String hobby, int height) {
        System.out.println("Хобби: " + hobby +
                "\n Рост: " + height);
    }
    public final static void BaskPlayer(String name){
        System.out.println("Имя: " + name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Имя: " + name +
                "\n Рост: " + height +
                "\n Хобби:" + hobby);
    }
}
