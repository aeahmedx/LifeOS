package LifeOS.Overarch;

import LifeOS.Overarch.LongTermGoals.LongTermGoals;
import LifeOS.Overarch.LongTermVision.LongTermVision;
import LifeOS.Overarch.Thermostat.Thermostat;

public class Overarch {

    private LongTermGoals longTermGoals;
    private LongTermVision longTermVision;
    private Thermostat thermostat;

    public LongTermGoals getLongTermGoals() {
        return longTermGoals;
    }

    public LongTermVision getLongTermVision() {
        return longTermVision;
    }

    public Thermostat getThermostat() {
        return thermostat;
    }

}
