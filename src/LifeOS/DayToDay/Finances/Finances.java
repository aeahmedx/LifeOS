package LifeOS.DayToDay.Finances;

import LifeOS.DayToDay.Finances.MoneyIn.MoneyIn;
import LifeOS.DayToDay.Finances.MoneyOut.MoneyOut;

import java.util.ArrayList;

import static java.lang.Double.sum;

public class Finances {

    private ArrayList<MoneyIn> moneyin;
    private ArrayList<MoneyOut> moneyout;
    private double runningBalance;

    public ArrayList<MoneyIn> getMoneyin() {
        return moneyin;
    }

    public ArrayList<MoneyOut> getMoneyout() {
        return moneyout;
    }

    public void setRunningBalance(double runningBalance) {
        this.runningBalance = runningBalance;
    } 

    public double getRunningBalance() {
        return runningBalance;
    }

    public void recordMoneyIn() {

        Scanner input = new Scanner(System.in);

        System.out.println("Money received: ")
        int moenyin = input.nextInt();

        System.out.println("Source: ")
        int source = input.nextLine();

        MoneyIn moneyin = new MoneyIn(moneyin, source);

        moneyin.add(moneyin);
        
    }

    public void recordMoneyOut() {

        Scanner input = new Scanner(System.in);

        System.out.println("Money used: ")
        int moenyout = input.nextInt();

        System.out.println("Source: ")
        int source = input.nextLine();

        MoneyOut moneyout = new MoneyOut(moneyout, source);

        moneyout.add(moneyout);
        
    }

    public void updateRunningBalance() {
        
        double runningBalance = 0;

        for (int i = 0; i < moneyin.size(); i++) {
            double transaction = moneyin.get(i).getMoneyin();
            runningBalance += transaction;
        }

        for (int i = 0; i < moneyout.size(); i++) {
            double transaction = moneyout.get(i).getMoneyout();
            runningBalance -= transaction;
        }

    }

}
