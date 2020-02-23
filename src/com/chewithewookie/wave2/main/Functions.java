package com.chewithewookie.wave2.main;

import java.awt.*;

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

    public static int stringWidth(String string, Graphics g){
        return g.getFontMetrics().stringWidth(string);
    }

    public static boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
        if(mx > x && mx < x + width){
            if(my > y && my < y +height){
                return true;
            }
        }
        return false;
    }

}
