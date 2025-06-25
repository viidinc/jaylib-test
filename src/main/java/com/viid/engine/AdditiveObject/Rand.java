package com.viid.engine.AdditiveObject;

import java.util.Random;

public class Rand {

    private static final Random random = new Random();

    public static float f(){
        return random.nextFloat();
    }
    public static float f(float min, float max){
        return random.nextFloat(min,max);
    }

}
