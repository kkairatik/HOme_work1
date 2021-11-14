package com.company;

import com.company.TypesOFPlayer;

public class Player implements PrintInfo {
    private int age;
    private String teamName;
    private TypesOFPlayer typesOFPlayer;

    public int getAge() {
        return age;
    }

    public String getTeamName() {
        return teamName;
    }

    public TypesOFPlayer getTypesOFPlayer() {
        return typesOFPlayer;
    }

    public Player(int age, String teamName, TypesOFPlayer typesOFPlayer, String name) {
        this.age = age;
        this.teamName = teamName;
        this.typesOFPlayer = typesOFPlayer;
    }

    @Override
    public void print() {
        System.out.println("Возраст: " + age +
                "\n Название команды: "  + teamName +
                "\n Тип команды: " + typesOFPlayer);

    }
}
