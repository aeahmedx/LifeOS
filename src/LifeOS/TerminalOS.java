package LifeOS;

import LifeOS.DayToDay.Finances.Finances;

public class TerminalOS {

    public static void main(String[] args) {


        System.out.println("Life OS");

        LifeOS lifeOS = new LifeOS();

        Finances  finances = new Finances();

        finances.recordMoneyIn();
        finances.recordMoneyOut();

        finances.updateRunningBalance();

        System.out.println(finances.getRunningBalance());

        System.out.println(finances.getMoneyIn().size());
        System.out.println(finances.getMoneyOut().size());


    }
}
