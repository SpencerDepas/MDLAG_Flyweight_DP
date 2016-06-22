package com.clearfaun.mdlag;

/**
 * Created by SpencerDepas on 6/21/16.
 */
public class CornFood implements FoodFlyweight {

    private String mFood = "corn food";

    //intrinsic info
    public CornFood(){
        System.out.println("Making corn food");
        //making corn food is costly, lets only make it once
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void feed(String animal, int servings) {

        System.out.println("Some animals need more servings than others.");
        System.out.println("A " + animal + " will eat " + servings + " servings of " + mFood + ". ");


    }
}