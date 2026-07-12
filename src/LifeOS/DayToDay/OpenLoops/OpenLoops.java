package LifeOS.DayToDay.OpenLoops;

import java.util.ArrayList;

public class OpenLoops {

    static ArrayList<OpenLoop> openLoops;

    public static ArrayList<OpenLoop> getOpenLoops() {
        return openLoops;
    }

    public static void setOpenLoops(ArrayList<OpenLoop> openLoops) {
        OpenLoops.openLoops = openLoops;
    }
}
