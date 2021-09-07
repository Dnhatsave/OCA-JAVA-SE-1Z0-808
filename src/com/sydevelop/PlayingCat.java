package com.sydevelop;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature < 24 && temperature > 46) {
                return true;
            } else if (temperature < 24 && temperature > 36) {
                return true;
            }
        }
        return false;

    }
}
