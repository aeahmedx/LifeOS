package LifeOS.DayToDay.Finances;

import LifeOS.DayToDay.Finances.MoneyIn.MoneyIn;
import LifeOS.DayToDay.Finances.MoneyOut.MoneyOut;

import java.util.ArrayList;
import java.util.Scanner;

public class Finances {

    private ArrayList<MoneyIn> moneyIn;
    private ArrayList<MoneyOut> moneyOut;
    private double runningBalance;

    public Finances() {
        moneyIn = new ArrayList<>();
        moneyOut = new ArrayList<>();
        runningBalance = 0;
    }

    public ArrayList<MoneyIn> getMoneyIn() {
        return moneyIn;
    }

    public ArrayList<MoneyOut> getMoneyOut() {
        return moneyOut;
    }

    public void setRunningBalance(double runningBalance) {
        this.runningBalance = runningBalance;
    } 

    public double getRunningBalance() {
        return runningBalance;
    }

    public void recordMoneyIn() {

        Scanner input = new Scanner(System.in);

        System.out.println("Money received: ");
        double in = input.nextDouble();
        input.nextLine();

        System.out.println("Source: ");
        String source = input.nextLine();

        MoneyIn moneyin = new MoneyIn(in, source);

        moneyIn.add(moneyin);
        updateRunningBalance();
        
    }

    public void recordMoneyOut() {

        Scanner input = new Scanner(System.in);

        System.out.println("Money used: ");
        double out = input.nextDouble();
        input.nextLine();

        System.out.println("Source: ");
        String source = input.nextLine();

        MoneyOut moneyout = new MoneyOut(out, source);

        moneyOut.add(moneyout);
        updateRunningBalance();
        
    }

    public void updateRunningBalance() {
        
        double runningBalance = 0;

        for (int i = 0; i < moneyIn.size(); i++) {
            double transaction = moneyIn.get(i).getMoneyin();
            runningBalance += transaction;
        }

        for (int i = 0; i < moneyOut.size(); i++) {
            double transaction = moneyOut.get(i).getMoneyOut();
            runningBalance -= transaction;
        }

        this.runningBalance = runningBalance;

    }

}
