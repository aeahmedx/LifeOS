package LifeOS.Overarch;

import LifeOS.Overarch.LongTermGoals.LongTermGoals;
import LifeOS.Overarch.LongTermVision.LongTermVision;
import LifeOS.Overarch.Thermostat.Thermostat;

public class Overarch {

    static LongTermGoals longTermGoals;
    static LongTermVision longTermVision;
    static Thermostat thermostat;

    public static LongTermGoals getLongTermGoals() {
        return longTermGoals;
    }

    public static void setLongTermGoals(LongTermGoals longTermGoals) {
        Overarch.longTermGoals = longTermGoals;
    }

    public static LongTermVision getLongTermVision() {
        return longTermVision;
    }

    public static void setLongTermVision(LongTermVision longTermVision) {
        Overarch.longTermVision = longTermVision;
    }

    public static Thermostat getThermostat() {
        return thermostat;
    }

    public static void setThermostat(Thermostat thermostat) {
        Overarch.thermostat = thermostat;
    }
}
