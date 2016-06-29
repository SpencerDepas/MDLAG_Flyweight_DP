package com.clearfaun.mdlag;

import java.util.ArrayList;

/**
 * Created by SpencerDepas on 6/29/16.
 */
public class FarmerMediator implements Mediator{

    private ArrayList<Colleague> colleagues;



    public FarmerMediator(){

        colleagues = new ArrayList<Colleague>();

    }


    @Override
    public void sellHighestPricedAnimal(int count) {

        int highestPriceAnimal = 0;
        int indexOfHighestPricedAnimal = 0;
        for(int i = 0 ; i < colleagues.size(); i ++){
            if(colleagues.get(i).getmCurrentPriceOfAnimals() > highestPriceAnimal){
                highestPriceAnimal = colleagues.get(i).getmCurrentPriceOfAnimals();
                indexOfHighestPricedAnimal = i;
            }
        }

        if(colleagues.get(indexOfHighestPricedAnimal).getmAnimalsInStock() > count){
            colleagues.get(indexOfHighestPricedAnimal).setmAnimalsInStock(
                    colleagues.get(indexOfHighestPricedAnimal).getmAnimalsInStock() - count);

            System.out.println("Selling " + count + " " +  colleagues.get(indexOfHighestPricedAnimal).getmAnimalType() + "s");
            System.out.println("For $" + colleagues.get(indexOfHighestPricedAnimal).getmCurrentPriceOfAnimals() + ".");
            System.out.println("We have " +colleagues.get(indexOfHighestPricedAnimal).getmAnimalsInStock() + " " +
                    colleagues.get(indexOfHighestPricedAnimal).getmAnimalType() + "s left");


        }

    }

    @Override
    public void sellHighestAnimalInStock(int count){

        int indexOfAnimalWithMostStock = 0;
        for(int i = 0 ; i < colleagues.size(); i ++){

        }
    }

    public void addColleague(Colleague newColleague){

        colleagues.add(newColleague);



    }


}