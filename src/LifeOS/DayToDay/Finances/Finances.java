package LifeOS.DayToDay.Finances;

import LifeOS.DayToDay.Finances.MoneyIn.MoneyIn;
import LifeOS.DayToDay.Finances.MoneyOut.MoneyOut;

import java.util.ArrayList;

import static java.lang.Double.sum;

public class Finances {

    private ArrayList<MoneyIn> moneyin;
    private ArrayList<MoneyOut> moneyout;

    public ArrayList<MoneyIn> getMoneyin() {
        return moneyin;
    }

    public ArrayList<MoneyOut> getMoneyout() {
        return moneyout;
    }

}
