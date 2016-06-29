package com.clearfaun.mdlag;

import java.util.Random;

/**
 * Created by SpencerDepas on 6/29/16.
 */
public class Colleague{

    private Mediator mMediator;
    private int mAnimalsInStock;
    private int mCurrentPriceOfAnimals;
    private String mAnimalType;

    public Colleague(Mediator m, String animalName) {
        mMediator = m;
        mMediator.addColleague(this);
        mAnimalType = animalName;

        Random rn = new Random();
        mAnimalsInStock = rn.nextInt(1000 - 500 + 1) + 500;
        rn = new Random();
        mCurrentPriceOfAnimals = rn.nextInt(100 - 5 + 1) + 5;
    }

    public void sellHighPricedAnimals(int count) {
        mMediator.sellHighestPricedAnimal(count);
    }
    public void sellHighestAnimalInStock(int count){
        mMediator.sellHighestAnimalInStock(count);
    }
    //get access to the mediator
    public Mediator getMediator() {return mMediator;}


    public int getmAnimalsInStock() {
        return mAnimalsInStock;
    }

    public void setmAnimalsInStock(int mAnimalsInStock) {
        this.mAnimalsInStock = mAnimalsInStock;
    }

    public int getmCurrentPriceOfAnimals() {
        return mCurrentPriceOfAnimals;
    }

    public void setmCurrentPriceOfAnimals(int mCurrentPriceOfAnimals) {
        this.mCurrentPriceOfAnimals = mCurrentPriceOfAnimals;
    }

    public String getmAnimalType() {
        return mAnimalType;
    }

    public void setmAnimalType(String mAnimalType) {
        this.mAnimalType = mAnimalType;
    }


 }