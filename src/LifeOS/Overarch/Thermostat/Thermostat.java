package LifeOS.Overarch.Thermostat;

import java.util.ArrayList;

public class Thermostat {

    static ArrayList<Temperature> temperatures;

    public static ArrayList<Temperature> getTemperatures() {
        return temperatures;
    }

    public static void setTemperatures(ArrayList<Temperature> temperatures) {
        Thermostat.temperatures = temperatures;
    }
}
