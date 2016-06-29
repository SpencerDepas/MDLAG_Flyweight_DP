package com.clearfaun.mdlag;

/**
 * Created by SpencerDepas on 6/21/16.
 */
public class ChickenFood implements FoodFlyweight {

    private String mFood = "chicken";

    //intrinsic info
    public ChickenFood(){
        System.out.println("Making chicken food");
        //making chicken food is costly,  lets only make it once
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void feed(String animal, int servings) {

        System.out.println("Some animals need more servings than others.");
        System.out.println(animal + " will eat " + servings + " servings of " + mFood + ". ");


    }
}
