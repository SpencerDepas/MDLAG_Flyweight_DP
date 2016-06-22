package com.clearfaun.mdlag;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SpencerDepas on 6/21/16.
 */
public class FoodFlyweightFactory {

    private static FoodFlyweightFactory mFlyweightFactory;
    private Map<String, FoodFlyweight> mFlyweightHashMap;
    public final static String CHICKEN_FOOD = "chicken";
    public final static String CORN_FOOD = "corn";


    private FoodFlyweightFactory() {
        mFlyweightHashMap = new HashMap<>();
    }

    public static FoodFlyweightFactory getInstance() {
        if (mFlyweightFactory == null) {
            mFlyweightFactory = new FoodFlyweightFactory();
        }
        return mFlyweightFactory;
    }

    public FoodFlyweight getFlyweight(String key) {


        FoodFlyweight flyweight = mFlyweightHashMap.get(key);


        if (flyweight != null) {
            return mFlyweightHashMap.get(key);
        } else {

            switch (key) {
                case CHICKEN_FOOD:
                    flyweight = new ChickenFood();
                    mFlyweightHashMap.put(key, flyweight);
                    break;
                case CORN_FOOD:
                    flyweight = new CornFood();
                    mFlyweightHashMap.put(key, flyweight);
                    break;
                default:
                    break;
            }

        }

        return flyweight;

    }

}