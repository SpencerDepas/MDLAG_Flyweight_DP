package com.clearfaun.mdlag;

public class Main {

    public static void main(String[] args) {
	// write your code here


        FarmerMediator mediator = new FarmerMediator();
        Colleague chickenFarmerColleague = new Colleague(mediator, "Chicken");
        Colleague pigFarmerColleague = new Colleague(mediator, "Pig");

        mediator.sellHighestPricedAnimal(4);

        //Selling 4 Pigs
        //For $85.
        //We have 606 Pigs left

    }
}
