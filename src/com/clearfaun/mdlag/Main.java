package com.clearfaun.mdlag;

import java.util.Random;

public class Main {

    public static void main(String[] args) {




        FoodFlyweightFactory foodFlyweightFactory = FoodFlyweightFactory.getInstance();

        //making food is hard
        //the first time we make chicken food or corn food it takes three seconds each
        //after that the foods cab be re used without waiting 3 secconds

        for (int i = 0; i < 1000; i++) {

            Random rand = new Random();

            int  servings = rand.nextInt(10) + 1;


            //concrete flyweight
            FoodFlyweight flyweight = foodFlyweightFactory.getFlyweight(FoodFlyweightFactory.CHICKEN_FOOD);
            flyweight.feed("Cat", servings);
            //servings is the extrinsic information

            flyweight = foodFlyweightFactory.getFlyweight(FoodFlyweightFactory.CORN_FOOD);
            flyweight.feed("FIsh", servings);
        }



        //sample output
        //

        //Making chicken food
        //Some animals need more servings than others.
        //Cat will eat 4 servings of chicken.
        //Making corn food
        //Some animals need more servings than others.
        //A Bear will eat 4 servings of corn food.

        //this repeats 100 times




        //**take note that the chicken and corn are only made once

    }
}
