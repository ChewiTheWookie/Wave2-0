package com.chewithewookie.wave2.main;

public class Functions {

    public static float clamp(float value, float min, float max){
        if(value > max){
            return max;
        }else if(value < min){
            return min;
        }else{
            return value;
        }
    }

}
