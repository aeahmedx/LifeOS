package LifeOS.DayToDay.Finances;

import java.util.ArrayList;

public class Finances {

    static ArrayList<MoneyIn> moneyin;
    static ArrayList<MoneyOut> moneyout;

    public static ArrayList<MoneyIn> getMoneyin() {
        return moneyin;
    }

    public static void setMoneyin(ArrayList<MoneyIn> moneyin) {
        Finances.moneyin = moneyin;
    }

    public static ArrayList<MoneyOut> getMoneyout() {
        return moneyout;
    }

    public static void setMoneyout(ArrayList<MoneyOut> moneyout) {
        Finances.moneyout = moneyout;
    }
}
