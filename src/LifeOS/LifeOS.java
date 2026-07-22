package LifeOS;

import LifeOS.DayToDay.DayToDay;
import LifeOS.Overarch.Overarch;
import LifeOS.Resources.Resources;

public class LifeOS {

    static DayToDay dayToDay;
    static Resources resources;
    static Overarch overarch;

    public LifeOS() {
        dayToDay = new DayToDay();
        resources = new Resources();
        overarch = new Overarch();
    }

}
