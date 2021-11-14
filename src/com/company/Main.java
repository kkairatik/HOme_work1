package com.company;

import java.lang.annotation.Target;

public class Main {

    public static void main(String[] args) {
        BasketPlayer object1 = new BasketPlayer(55,"Black Sharks", TypesOFPlayer.STRONG, "Саня");
        Father object2 = new Father(12, "White Sharks", TypesOFPlayer.STUPID,"Канат");
        Father object3 = new Father (13,"Sharks", TypesOFPlayer.WEAK,"Жыргал");

        object1.print();
        object2.print();
        object3.print();


    }
}
