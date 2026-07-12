package LifeOS.Overarch.LongTermVision;

import java.util.ArrayList;

public class LongTermVision {

    static ArrayList<Vision> visions;

    public static ArrayList<Vision> getVisions() {
        return visions;
    }

    public static void setVisions(ArrayList<Vision> visions) {
        LongTermVision.visions = visions;
    }
}
